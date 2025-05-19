import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String brandName = sc.nextLine();
        if (brandName.contains("m"))
            System.out.println("No");
        else
            System.out.println("Yes");
    }
}