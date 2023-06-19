import java.util.Scanner;

// This file is made by EmJey
// Project: ShayanVaVaredatSangPa - Algorithm Basics Quera
// FileName: Main
// Date: 2023/06/19
// Email: emjeydev@gmail.com
// Github: emjeydev

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int weight = 0, price = 0;

        for (int i = 0; i < n; i++) {
            weight = sc.nextInt();

            if (isPrime(weight))
                price += primeCount(weight);
            else
                price += divisorCount(weight);
        }

        if (isPrime(price))
            price -= primeCount(price);
        else
            price -= divisorCount(price);

        System.out.println(price);
    }

    public static boolean isPrime(int a) {
        if (a <= 1)
            return false;

        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0)
                return false;
        }

        return true;
    }

    public static int primeCount(int a) {
        int count = 0;
        for (int i = 0; i < a; i++) {
            if (isPrime(i))
                count++;
        }

        return count;
    }

    public static int divisorCount(int a) {
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && isPrime(i))
                count++;
        }

        return count;
    }
}