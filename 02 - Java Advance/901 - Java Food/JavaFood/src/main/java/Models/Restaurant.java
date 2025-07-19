package Models;

import JavaFood.AdminPanel;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Data
public class Restaurant {
    public enum RestaurantTypes {
        FASTFOOD, IRANI, VEGETARIAN, KEBAB, SALAD, CAFE, SUPERMARKET, COFFEE
    }

    private RestaurantTypes type;
    private Integer id;
    private String name;
    private Double score = 0.0;
    private Integer scoreCounts = 0;
    private String address;
    int openHour, closeHour;
    final LinkedHashMap<Food, Integer> foods = new LinkedHashMap<>();
    private Boolean isOpen = false;

    public Restaurant(Integer id, String name, String address, int openHour, int closeHour, RestaurantTypes type) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.openHour = openHour;
        this.closeHour = closeHour;
        this.type = type;
    }

    public void openRestaurant() {
        isOpen = true;
    }

    public void closeRestaurant() {
        isOpen = false;
    }

    public void addFood(Food food, Integer quantity) {
        foods.put(food, quantity);
    }

    public int getTodayOrdersCount() {
        return (int) AdminPanel.orders.stream().filter(f -> f.getRestaurant().getId().equals(id) && f.getOrderDateTime().equals(LocalDateTime.now())).count();
    }

    public int getAllOrdersCount() {
        return (int) AdminPanel.orders.stream().filter(f -> f.getRestaurant().getId().equals(id)).count();
    }

    public Double getTodayOrdersAmount() {
        return AdminPanel.orders.stream().filter(f -> f.getRestaurant().getId().equals(id) && f.getOrderDateTime().equals(LocalDateTime.now())).mapToDouble(Order::getTotalPrice).sum();
    }

    public Double getAllOrdersAmount() {
        return AdminPanel.orders.stream().filter(f -> f.getRestaurant().getId().equals(id)).mapToDouble(Order::getTotalPrice).sum();

    }

    public void updateFoodQuantity(Food food, Integer quantity) {
        foods.replace(food, quantity);
    }

    public Food getMostOrderedFood() {
        return AdminPanel.orders.stream().flatMap(order -> order.getFoods().entrySet().stream()).collect(Collectors.groupingBy(Map.Entry::getKey, Collectors.summingInt(Map.Entry::getValue))).entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
    }
}