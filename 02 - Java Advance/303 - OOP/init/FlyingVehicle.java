public class FlyingVehicle extends Vehicle {
    private String fuel;
    private int numberOfFins;
    private int numberOfWheels;
    private String steeringWheel;

    public FlyingVehicle(String name, int price, int numberOfSeats, int maxSpeed, String fuel, int numberOfFins, int numberOfWheels, String steeringWheel) {
        super(name, price, numberOfSeats, maxSpeed);
        this.fuel = fuel;
        this.numberOfFins = numberOfFins;
        this.numberOfWheels = numberOfWheels;
        this.steeringWheel = steeringWheel;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getNumberOfFins() {
        return numberOfFins;
    }

    public void setNumberOfFins(int numberOfFins) {
        this.numberOfFins = numberOfFins;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(String steeringWheel) {
        this.steeringWheel = steeringWheel;
    }
}
