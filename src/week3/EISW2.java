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
        long maxSum = -1000000;
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextLong();
            if (i<subArray.length) {
                subArray[i] = nums[i];
            }
        }

        // for (int i = 0; i < k; i++) {
            
        // }
        for (int i = 0; i < subArray.length; i++) {
            sum += subArray[i];
        }

        for (int i = 0; i < nums.length; i++) {
            // avg = sum / k;
            // if (avg > maxAvg)
            //     maxAvg = avg;
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
