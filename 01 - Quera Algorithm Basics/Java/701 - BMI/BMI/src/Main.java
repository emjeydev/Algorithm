import java.util.Scanner;

// This file is made by EmJey
// Project: BMI
// FileName: Main
// Date: 2023/06/20
// Email: emjeydev@gmail.com
// Github: emjeydev

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int weight = sc.nextInt();
        double height = sc.nextDouble();
        double bmi = weight / (height * height);

        System.out.printf("%.2f %n", bmi);

        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi >= 18.5 && bmi < 25)
            System.out.println("Normal");
        else if (bmi >= 25 && bmi < 30)
            System.out.println("Overweight");
        else if (bmi >= 30)
            System.out.println("Obese");
        else
            System.out.println("Not a correct number");
    }
}