import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, d;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        double sum = a + b + c + d;
        double product = a * b * c * d;
        double max = Math.max(Math.max(Math.max(a, b), c), d);
        double min = Math.min(Math.min(Math.min(a, b), c), d);

        System.out.printf("Sum : %6f\n", sum);
        System.out.printf("Average : %6f\n", sum / 4);
        System.out.printf("Product : %6f\n", product);
        System.out.printf("Max : %6f\n", max);
        System.out.printf("Min : %6f\n", min);

    }
}