package Exceptions;

public class RestaurantIsClose extends RuntimeException {
    public RestaurantIsClose() {
        System.out.println("Restaurant is closed");
    }
}
