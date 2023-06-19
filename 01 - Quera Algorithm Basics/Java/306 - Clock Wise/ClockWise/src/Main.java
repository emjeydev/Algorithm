import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int hour = (12 - a) % 12;
        int min = (60 - b) % 60;

        System.out.printf("%02d:", hour );
        System.out.printf("%02d", min);
    }
}