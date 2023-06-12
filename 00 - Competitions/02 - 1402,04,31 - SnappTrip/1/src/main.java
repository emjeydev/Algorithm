import java.util.ArrayList;
import java.util.Scanner;

public class main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int loopLength = sc.nextInt();
        int a = 0, b = 0, c = 0, d = 0;

        for (int i = 0; i < loopLength; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();


            if (b + d > a + c) {
                System.out.println("esteghlal");
            } else if (a + c > b + d) {
                System.out.println("perspolis");
            } else if (a + c == b + d && c > b) {
                System.out.println("perspolis");
            } else if (a + c == b + d && b > c) {
                System.out.println("esteghlal");
            } else if (a + c == b + d && b == c) {
                System.out.println("penalty");
            }

        }
    }
}
