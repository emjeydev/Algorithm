import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k, x;
        k = sc.nextInt();
        x = k * (k + 1) / 2;
        System.out.println(x);
    }
}