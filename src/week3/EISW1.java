package week3;

import java.util.Arrays;
import java.util.Scanner;

public class EISW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int minus = Integer.MAX_VALUE;
        int min = 0;
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        if (nums.length == 1) {
            minus = 0;
        } else
            for (int i = 0; i < nums.length; i++) {

                min = nums[i + k - 1] - nums[i];
                if (min < minus) {
                    minus = min;
                }
                if (i + k > nums.length - 1) {
                    break;
                }
            }
        System.out.println(minus);
        sc.close();
    }
}
