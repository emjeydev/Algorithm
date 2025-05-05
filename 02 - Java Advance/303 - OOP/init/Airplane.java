public class Airplane extends FlyingVehicle {
    private String airline;
    private int numberOfCrew;
    private String captain;

    public Airplane(String name, int price, int numberOfSeats, int maxSpeed, String fuel, int numberOfFins, int numberOfWheels, String steeringWheel, String airline, int numberOfCrew, String captain) {
        super(name, price, numberOfSeats, maxSpeed, fuel, numberOfFins, numberOfWheels, steeringWheel);
        this.airline = airline;
        this.numberOfCrew = numberOfCrew;
        this.captain = captain;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getNumberOfCrew() {
        return numberOfCrew;
    }

    public void setNumberOfCrew(int numberOfCrew) {
        this.numberOfCrew = numberOfCrew;
    }

    public String getCaptain() {
        return captain;
    }

    public void setCaptain(String captain) {
        this.captain = captain;
    }
}
