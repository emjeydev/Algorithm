import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>(3);
        String input;
        int m;
        int n;
        do {
            input = sc.next();

            if (input.equals("1")) {
                list = new ArrayList<>(3);
            } else if (input.equals("2")) {
                list = null;
            } else if (input.equals("3")) {
                m = sc.nextInt();
                try {
                    list.add(m);
                } catch (NullPointerException e) {
                    System.out.println("nulle");
                }
            } else if (input.equals("4")) {
                n = sc.nextInt();
                try {
                    System.out.println(list.get(n));
                } catch (NullPointerException e) {
                    System.out.println("nulle");
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("oute");
                }
            } else if (input.equals("5")) {
                m = sc.nextInt();
                n = sc.nextInt();
                try {
                    System.out.println(m / n);
                } catch (ArithmeticException e) {
                    System.out.println("sefre");
                }
            } else if (input.equals("6"))
                break;
        } while (!input.equals("6"));
    }
}