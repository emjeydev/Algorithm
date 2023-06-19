import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int ofoghi, amodi;

        if (n % 2 == 0) {
            ofoghi = n / 2;
        } else {
            ofoghi = n / 2 + 1;
        }
        amodi = n / 2;

        int result = (ofoghi + 1) * (amodi + 1);

        System.out.println(result);
    }
}