import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int hIndex(int[] citations) {
        Arrays.sort(citations);

        int result = 0;
        for (int i = citations.length - 1; i >= 0; i--) {
            int cnt = citations.length - i;
            if (citations[i] >= cnt) {
                result = cnt;
            } else {
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int inputCitation[] = new int[n];

        for (int i = 0; i < n; i++) {
             inputCitation[i] = sc.nextInt();
        }

        System.out.println(hIndex(inputCitation));

    }


}

