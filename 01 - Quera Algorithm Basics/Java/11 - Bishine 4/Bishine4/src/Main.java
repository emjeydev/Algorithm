import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if (a > b && a > c && a > d)
            System.out.println(a);
        else if (b > a && b > c && a > d)
            System.out.println(b);
        else if (c > a && c > b && c > d)
            System.out.println(c);
        else if (d > a && d > b && d > c)
            System.out.println(d);
        else if (a == b && a > c)
            System.out.println(a);
        else if (a == b && c > a)
            System.out.println(c);
        else if (a == c && a > b)
            System.out.println(a);
        else if (a == c && b > a)
            System.out.println(b);
        else if (a == d && a > b)
            System.out.println(a);
        else if (a == d && b > a)
            System.out.println(b);
        else
            System.out.println(a);
    }
}