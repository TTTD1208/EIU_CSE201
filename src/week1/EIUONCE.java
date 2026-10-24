package week1;

import java.util.Arrays;
import java.util.Scanner;

public class EIUONCE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int o = 0; o < n; o++) {
            int k = sc.nextInt();
            int[] nums = new int[k];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = sc.nextInt();
            }

            Arrays.sort(nums);

            for (int i = 0; i < nums.length; i++) {
                if (i == 0) {
                    if (nums[i] != nums[i + 1]) {
                        System.out.print(nums[i] + " ");
                    }
                } else if (i == nums.length - 1) {
                    if (nums[i] != nums[i - 1]) {
                        System.out.print(nums[i] + " ");
                    }
                } else {
                    if (nums[i] != nums[i + 1] && nums[i] != nums[i - 1]) {
                        System.out.print(nums[i] + " ");
                    }
                }
            }
        }
        sc.close();
    }
}
