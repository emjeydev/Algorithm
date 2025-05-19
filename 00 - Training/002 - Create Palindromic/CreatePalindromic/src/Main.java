import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int n = input.length();
        int i = 0;
        int j = n - 1;
        int last = j;

        while (i <= j) {
            if (input.charAt(i) == input.charAt(j)) {
                i++;
                j--;
            } else {
                i = 0;
                last--;
                j = last;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int k = n - 1; k > last; k--) {
            sb.append(input.charAt(k));
        }
        sb.append(input);

        System.out.println(sb);
    }
}