import java.util.Scanner;

// This file is made by EmJey
// Project: B.M.M - Algorithm Basics Quera
// FileName: Main
// Date: 2023/06/19
// Email: emjeydev@gmail.com
// Github: emjeydev

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int answer = 1;

        for (int i = 0; i < n; i++) {
            if (gcd(i, n) == 1)
                answer =  lcm(answer, i);
        }

        System.out.println(answer);
    }

    public static int gcd(int a, int b) {
        int c = 0;
        if (a > b) {
            c = a;
            a = b;
            b = c;
        }

        while (a > 0) {
            b = b % a;
            c = a;
            a = b;
            b = c;
        }

        return b;
    }

    public static int lcm(int a, int b) {
        return ((a * b) / (gcd(a, b)));
    }

}