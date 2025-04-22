import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> goodStudents = new ArrayList<>();
        List<String> badStudents = new ArrayList<>();

        int input;
        String name;

        do {
            input = sc.nextInt();
            if (input == 1) {
                name = sc.next();
                goodStudents.add(name);
            }
            if (input == 2) {
                name = sc.next();
                badStudents.add(name);
            }
            if (input == 3)
                System.out.println(goodStudents.size());
            if (input == 4)
                System.out.println(badStudents.size());
            if (input == 5)
                goodStudents.clear();
            if (input == 6)
                badStudents.clear();
            if (input == 7) {
                int index = sc.nextInt();
                if (index > goodStudents.size())
                    System.out.println("not available!");
                else
                    System.out.println(goodStudents.get(index - 1));
            }
            if (input == 8) {
                int index = sc.nextInt();
                if (index > badStudents.size())
                    System.out.println("not available!");
                else
                    System.out.println(badStudents.get(index - 1));
            }
        } while (input < 9);
    }
}