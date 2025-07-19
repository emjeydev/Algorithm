package JavaFood;

import Models.Discount;
import Models.Food;
import Models.Order;
import Models.Restaurant;
import Users.User;

import java.time.LocalDate;
import java.util.ArrayList;

public class AdminPanel {
    public static LocalDate todayDate;
    public static ArrayList<Restaurant> restaurants = new ArrayList<>();
    public static ArrayList<User> users = new ArrayList<>();
    public static ArrayList<Discount> discounts = new ArrayList<>();
    public static ArrayList<Order> orders = new ArrayList<>();
}