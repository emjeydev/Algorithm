import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        if (x1 > x)
            System.out.println("Right");
        else if (x1 < x)
            System.out.println("Left");
    }
}