import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int firstArray[] = new int[n];
        int secondArray[] = new int[n];
        int summationArray[] = new int[n];

        for (int i = 0; i < n; i++) {
            firstArray[i] = sc.nextInt();
        }

        for (int j = 0; j < n; j++) {
            secondArray[j] = sc.nextInt();
        }

        for (int k = 0; k < n; k++) {
            summationArray[k] = firstArray[k] + secondArray[k];
            System.out.print(summationArray[k] + " ");
        }

//        System.out.println(summationArray);

    }
}