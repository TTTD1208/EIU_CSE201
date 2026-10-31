package week3;

import java.util.Scanner;

public class EIPFS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        long[] nums = new long[n];
        long[] predNums = new long[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextLong();
        }
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                predNums[0] = nums[0];
            } else {
                predNums[i] = predNums[i - 1] + nums[i];
            }
        }
        for (int i = 0; i < q; i++) {
            int left = sc.nextInt();
            int right = sc.nextInt();
            long ans;
            if (left == 0) {
                ans = predNums[right];
            } else
                ans = predNums[right] - predNums[left - 1];
            System.out.println(ans);
        }
        sc.close();
    }
}
