package JavaFood;

import Models.Discount;
import Models.Food;
import Models.Order;
import Models.Restaurant;
import Users.Admin;
import Users.Customer;
import Users.RestaurantOwner;
import Users.User;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class AdminPanel {
    public static LocalDate todayDate;
    public static ArrayList<Restaurant> restaurants = new ArrayList<>();
    public static ArrayList<User> users = new ArrayList<>();
    public static ArrayList<Discount> discounts = new ArrayList<>();
    public static ArrayList<Order> orders = new ArrayList<>();

    public void loadFromJSONFile(String fileAddress) throws IOException {
        Gson gson = new Gson();
        FileReader reader = new FileReader(fileAddress);
        JsonObject root = gson.fromJson(reader, JsonObject.class);

        String todayDateString = root.get("todayDate").getAsString();
        AdminPanel.todayDate = LocalDate.parse(todayDateString);

        JsonArray restaurantsJson = root.getAsJsonArray("restaurants");
        for (JsonElement elem : restaurantsJson) {
            JsonObject resObj = elem.getAsJsonObject();

            int id = resObj.get("id").getAsInt();
            String name = resObj.get("name").getAsString();
            String address = resObj.get("address").getAsString();
            int openHour = resObj.get("openHour").getAsInt();
            int closeHour = resObj.get("closeHour").getAsInt();
            String type = resObj.get("type").getAsString();

            Restaurant restaurant = new Restaurant(id, name, address, openHour, closeHour, Restaurant.RestaurantTypes.valueOf(type));

            JsonArray foodsJson = resObj.getAsJsonArray("foods");
            for (JsonElement foodElem : foodsJson) {
                JsonObject foodObj = foodElem.getAsJsonObject();

                int foodId = foodObj.get("id").getAsInt();
                String foodName = foodObj.get("name").getAsString();
                double price = foodObj.get("price").getAsDouble();
                int quantity = foodObj.get("quantity").getAsInt();

                Food food = new Food(foodId, foodName, price);
                restaurant.addFood(food, quantity);
            }

            AdminPanel.restaurants.add(restaurant);
        }

        JsonObject usersJson = root.getAsJsonObject("users");

        JsonArray ownersJson = usersJson.getAsJsonArray("restaurantOwners");
        for (JsonElement ownerElem : ownersJson) {
            JsonObject ownerObj = ownerElem.getAsJsonObject();

            int ownerId = ownerObj.get("id").getAsInt();
            String ownerName = ownerObj.get("name").getAsString();
            JsonArray ownedRestArr = ownerObj.getAsJsonArray("ownedRestaurants");

            RestaurantOwner owner = new RestaurantOwner(ownerId, ownerName);

            for (JsonElement restId : ownedRestArr) {
                restaurants.stream().filter(f -> f.getId().equals(restId.getAsInt())).findFirst().ifPresent(restaurant -> {
                    owner.restaurants.add(restaurant);
                });
            }

            AdminPanel.users.add(owner);
        }

        JsonArray adminsJson = usersJson.getAsJsonArray("admins");

        if (!adminsJson.isEmpty()) {
            for (JsonElement adminElem : adminsJson) {
                JsonObject adminObj = adminElem.getAsJsonObject();
                int adminId = adminObj.get("id").getAsInt();
                String adminName = adminObj.get("name").getAsString();

                Admin admin = new Admin(adminId, adminName);
                AdminPanel.users.add(admin);
            }
        }

        JsonArray customersJson = usersJson.getAsJsonArray("customers");
        for (JsonElement customerElement : customersJson) {
            JsonObject customerObject = customerElement.getAsJsonObject();

            int customerId = customerObject.get("id").getAsInt();
            String customerName = customerObject.get("name").getAsString();

            Customer customer = new Customer(customerId, customerName);
            AdminPanel.users.add(customer);
        }

        JsonArray discountsJson = root.getAsJsonArray("discounts");
        for (JsonElement discountElem : discountsJson) {
            JsonObject discountObj = discountElem.getAsJsonObject();

            int id = discountObj.get("id").getAsInt();
            String code = discountObj.get("code").getAsString();
            double amount = discountObj.get("amount").getAsDouble();
            LocalDate expireDate = LocalDate.parse(discountObj.get("expireDate").getAsString());
            int userId = discountObj.get("userId").getAsInt();

            Discount discount = new Discount(id, code, amount, expireDate, userId);
            AdminPanel.discounts.add(discount);
        }
    }

    public void addDiscount(Discount discount) {
        discounts.add(discount);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void addRestaurant(Restaurant restaurant) {
        restaurants.add(restaurant);
    }

    public Order createOrder(Integer id, Integer userId, Integer restaurant_id, Order.ReceivingType type) {
        Optional<Restaurant> restaurant = restaurants.stream().filter(f -> Objects.equals(f.getId(), restaurant_id)).findFirst();
        return restaurant.map(value -> new Order(id, userId, value, type)).orElse(null);
    }

    public void setDate(LocalDate todayDate) {
        AdminPanel.todayDate = todayDate;
    }

    public Restaurant getBestRestaurant() {
        return restaurants.stream().max(Comparator.comparingDouble(Restaurant::getScore)).orElse(null);
    }

    public Restaurant getMostOrderedRestaurant() {
        return orders.stream().collect(Collectors.groupingBy(Order::getRestaurant, Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
    }
}