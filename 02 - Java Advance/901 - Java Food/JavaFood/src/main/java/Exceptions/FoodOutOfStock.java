package Exceptions;

public class FoodOutOfStock extends RuntimeException {
    public FoodOutOfStock() {
        System.out.println("Food out of stock");
    }
}
