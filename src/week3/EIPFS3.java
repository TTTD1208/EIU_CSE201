package week3;

import java.util.Scanner;

public class EIPFS3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
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

        for (int i = 0; i < predNums.length; i++) {
            long left;
            long right;
            if (i == 0) {
                left = 0;
                right = predNums[predNums.length - 1] - predNums[i ];
            } else if (i == predNums.length - 1) {
                right = 0;
                left = predNums[i - 1];
            } else {
                left = predNums[i-1];
                 right = predNums[predNums.length - 1] - predNums[i ];
            }
            if (left == right) {
                System.out.println(i);
                break;
            }
            if (i == predNums.length - 1 && left !=right) {
                System.out.println(-1);
            }
        }
        sc.close();
    }
}
