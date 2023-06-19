import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();

        int sum = 1;

        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                for (int j = 1; j <= b; j++) {
                    if (b % j == 0) {
                        if (i + j < x)
                            sum++;
                    }
                }
            }
        }

        System.out.println(sum);
    }
}