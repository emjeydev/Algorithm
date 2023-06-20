import java.util.Scanner;

// This file is made by EmJey
// Project: LivanBazi
// FileName: Main
// Date: 2023/06/20
// Email: emjeydev@gmail.com
// Github: emjeydev

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char pointer = sc.next().charAt(0);

        for (int i = 0; i < n; i++) {
            char l1 = sc.next().charAt(0);
            char l2 = sc.next().charAt(0);

            if (l1 == pointer)
                pointer = l2;
            else if (l2 == pointer)
                pointer = l1;
        }

        System.out.println(pointer);
    }
}