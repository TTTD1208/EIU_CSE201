package week1;

import java.util.Arrays;
import java.util.Scanner;

public class Eiukmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        for (int i = n-1; i >=n-k; i--) {
            System.out.print(nums[i]+ " ");
        }
        sc.close();
    }
}
