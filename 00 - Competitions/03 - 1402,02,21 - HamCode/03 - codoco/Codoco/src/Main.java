import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, n, i, j, x, c;

        a = sc.nextInt();
        b = sc.nextInt();
        n = sc.nextInt();

        int[][] codoco = new int[a * b][a * b];

        for (c = 0; c < n; c++) {
            i = sc.nextInt() - 1;
            j = sc.nextInt() - 1;
            x = sc.nextInt();

            if (c % 2 == 0) {
                System.out.println("player 1:");
            } else {
                System.out.println("player 2:");
            }

            if (codoco[i][j] == 0 && codoco[i][j] != x && findAns(codoco, x, j) == -1 && findAnsrow(codoco, x, i) == -1) {
                codoco[i][j] = x;


                showArrat(codoco);

            } else {
                System.out.println("invalid move");
                c--;
            }

        }
    }

    public static void showArrat(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static int findAns(int[][] arr, int target, int j) {
        int row = 0;
        int col = arr[row].length - 1;
        while (row < arr.length && col >= 0) {
            if (arr[row][col] == target && col == j) {
                return 1;
            }

            // Target lies in further row
            if (arr[row][col] < target) {
                row++;
            }
            // Target lies in previous column
            else {
                col--;
            }
        }
        return -1;
    }

    public static int findAnsrow(int[][] arr, int target, int i) {
        int row = 0;
        int col = arr[row].length - 1;
        while (row < arr.length && col >= 0) {
            if (arr[row][col] == target && row == i) {
                return 1;
            }

            // Target lies in further row
            if (arr[row][col] < target) {
                row++;
            }
            // Target lies in previous column
            else {
                col--;
            }
        }
        return -1;
    }

}