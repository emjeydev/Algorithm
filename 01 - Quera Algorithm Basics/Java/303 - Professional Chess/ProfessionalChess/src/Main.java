import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kings, queens, rooks, bishops, knights, pawns;
        kings = sc.nextInt();
        queens = sc.nextInt();
        rooks = sc.nextInt();
        bishops = sc.nextInt();
        knights = sc.nextInt();
        pawns = sc.nextInt();

        System.out.print(1 - kings + " ");
        System.out.print(1 - queens + " ");
        System.out.print(2 - rooks + " ");
        System.out.print(2 - bishops + " ");
        System.out.print(2 - knights + " ");
        System.out.print(8 - pawns + " ");
    }
}