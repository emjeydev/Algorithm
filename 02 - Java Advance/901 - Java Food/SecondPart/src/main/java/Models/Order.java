package Models;

import Exceptions.*;
import JavaFood.AdminPanel;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

@Data
public class Order {
    private Integer id;
    // Food - quantity
    private final HashMap<Food, Integer> foods = new HashMap<>();
    private Double discountPrice = 0.0;
    private Integer userId;
    private Restaurant restaurant;
    private LocalDateTime orderDateTime;
    private Double totalPrice = 0.0;
    private ReceivingType receivingType;
    private Boolean isPaid = false, isScored = false;
    private Integer score;

    public Order(Integer id, Integer userId, Restaurant restaurant, ReceivingType receivingType) {
        this.id = id;
        this.userId = userId;
        this.restaurant = restaurant;
        this.receivingType = receivingType;
    }

    public enum ReceivingType {
        IN_PERSON, COURIER
    }

    public void addFoodToOrder(Integer foodId, int orderQuantity) {
        LinkedHashMap<Food, Integer> foodList = restaurant.foods;

        Map.Entry<Food, Integer> food = foodList.entrySet().stream().filter(entry -> entry.getKey().getId().equals(foodId)).findFirst().orElseThrow(FoodNotFound::new);

        if (food.getValue() < orderQuantity) throw new FoodOutOfStock();

        if (!restaurant.getIsOpen()) throw new RestaurantIsClose();

        this.foods.put(food.getKey(), orderQuantity);
    }

    public void addDiscount(String code) {
        Optional<Discount> discount = AdminPanel.discounts.stream().filter(d -> d.getCode().equals(code)).findFirst();
        if (discount.isEmpty()) throw new InvalidDiscountCode("Discount code not found");
        if (discount.get().getIsUsed()) throw new InvalidDiscountCode("Discount code already used");
        if (discount.get().getExpireDate().isBefore(LocalDate.now())) throw new InvalidDiscountCode("Discount is over");
        if (!discount.get().getUserId().equals(userId)) throw new InvalidDiscountCode("This discount is not for you");

        this.discountPrice = discount.get().getAmount();
    }

    public void pay(Double amount) {
        if (!totalPrice.equals(amount)) throw new PayException();

        isPaid = true;
        orderDateTime = LocalDateTime.now();
        orderDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));
    }

    public void scoreOrder(Integer score) {
        if (this.score != null) throw new InvalidScore("Already scored");
        if (!isPaid) throw new InvalidScore("Not paid yet");
        if (score < 1 || score > 5) throw new InvalidScore("Invalid score");
    }
}