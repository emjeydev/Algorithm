import java.util.Scanner;

// This file is made by EmJey
// Project: DargirDar
// FileName: Main
// Date: 2023/06/20
// Email: emjeydev@gmail.com
// Github: emjeydev

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int doorWidth = sc.nextInt();
        int doorHeight = sc.nextInt();
        int masoudWidth = sc.nextInt();
        int masoudHeight = sc.nextInt();

        if (doorWidth >= masoudWidth && doorHeight >= masoudHeight)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}