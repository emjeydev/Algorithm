import java.util.ArrayList;
import java.util.Scanner;

public class main {
    static Scanner sc = new Scanner(System.in);

    static int xorOfArray(ArrayList<Integer> arr, int n)
    {
        int xor_arr = 0;

        for (int i = 0; i < n; i++) {
            xor_arr = xor_arr ^ arr.get(i);
        }

        return xor_arr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int arrLength = sc.nextInt();

        for (int i = 0; i < arrLength; i++) {
            int c = sc.nextInt();
            nums.add(c);
        }

        System.out.println(xorOfArray(nums,arrLength));
    }
}
