import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] firstExpression = sc.next().split("");
        String[] secondExpression = sc.next().split("");
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (!firstExpression[i].equals(secondExpression[i]))
                sum++;
        }

        System.out.println(sum);
    }
}