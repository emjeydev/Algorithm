public class Vehicle {
    private String name;
    private int price;
    private int numberOfSeats;
    private int maxSpeed;

    public Vehicle(String nam1e, int price, int numberOfSeats, int maxSpeed) {
        this.name = nam1e;
        this.price = price;
        this.numberOfSeats = numberOfSeats;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
