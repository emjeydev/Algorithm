import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int i = 1;

        while (true) {
            int i1 = (i * (i + 1)) / 2;

            if (numDivs(i1) >= a) {
                System.out.println(i1);
                break;
            }

            i++;
        }

    }

    static int numDivs(int a) {
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                count++;
            }
        }
        return count;
    }
}