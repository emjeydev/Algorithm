import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        if (x == x1)
            System.out.print(x2 + " ");
        else if (x == x2)
            System.out.print(x1 + " ");
        else if (x1 == x2)
            System.out.print(x + " ");

        if (y == y1)
            System.out.print(y2);
        else if (y == y2)
            System.out.print(y1);
        else if (y1 == y2)
            System.out.print(y);
    }
}