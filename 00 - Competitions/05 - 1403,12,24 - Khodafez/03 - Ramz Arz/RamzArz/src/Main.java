import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // تعداد تست‌ها

        while (t-- > 0) {
            int n = scanner.nextInt(); // تعداد رمزارزها
            int[] beauty = new int[n];
            int[] power = new int[n];

            int minValidPower = 0;
            int minValidBeauty = 0;

            for (int i = 0; i < n; i++) {
                beauty[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                power[i] = scanner.nextInt();
            }

            // پیدا کردن حداقل قدرتی که باعث می‌شود همه‌ی رمزارزها وارد شوند
            for (int i = 0; i < n; i++) {
                minValidPower = Math.max(minValidPower, Math.min(power[i], beauty[i]));
            }

            // پیدا کردن حداقل زیبایی که باعث می‌شود همه‌ی رمزارزها وارد شوند
            for (int i = 0; i < n; i++) {
                minValidBeauty = Math.max(minValidBeauty, Math.min(power[i], beauty[i]));
            }

            // پیدا کردن بیشترین مجموع ممکن
            int result = minValidPower + minValidBeauty;
            System.out.println(result);
        }
        scanner.close();
    }

}