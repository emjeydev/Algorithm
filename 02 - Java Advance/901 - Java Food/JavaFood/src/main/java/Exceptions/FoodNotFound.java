package Exceptions;

public class FoodNotFound extends RuntimeException {
    public FoodNotFound() {
        System.out.println("Food not exists");
    }
}
