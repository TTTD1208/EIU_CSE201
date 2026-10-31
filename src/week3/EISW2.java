package week3;

import java.util.Scanner;

public class EISW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] nums = new long[n];
        long[] subArray = new long[k];
        double maxAvg = 0;
        long maxSum;
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextLong();
            if (i<subArray.length) {
                subArray[i] = nums[i];
            }
        }
        for (int i = 0; i < subArray.length; i++) {
            sum += subArray[i];
        }
        maxSum = sum;
        for (int i = 0; i < nums.length; i++) {
            if (sum>maxSum) {
                maxSum=sum;
            }
            if (i + k >= nums.length) {
                break;
            }
            sum += nums[i + k];
            sum -= nums[i];
        }
        maxAvg = (double)maxSum/k;
        System.out.println(maxAvg);
        sc.close();
    }
}
