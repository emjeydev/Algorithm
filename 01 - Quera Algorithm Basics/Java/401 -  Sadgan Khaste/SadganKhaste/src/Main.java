import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (reverseNum(a) > reverseNum(b)) {
            System.out.println(b + " < " + a);
        } else if (reverseNum(b) > reverseNum(a)) {
            System.out.println(a + " < " + b);
        } else {
            System.out.println(a + " = " + b);
        }

    }

    public static int reverseNum(int num) {
        String result = "";
        result = String.valueOf(num % 10);
        result += String.valueOf((num / 10) % 10);
        result += String.valueOf(((num / 10) / 10) % 10);

        return Integer.parseInt(result);
    }
}