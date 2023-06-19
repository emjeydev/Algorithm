import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int m = 0;

        while (n > 0) {
            m = m * 10 + (n % 10);
            n = n / 10;
        }

        System.out.println(m);
    }
}