package Users;
import JavaFood.AdminPanel;
import Models.Order;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class User {
    public int id;
    public String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public ArrayList<Order> getOrders() {
        throw new UnsupportedOperationException("not implemented yet");
    }
}