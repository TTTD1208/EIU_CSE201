package week2;

import java.util.Arrays;
import java.util.Scanner;

public class EiuGifts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numsOfChoice = sc.nextInt();
        long maxMoney = sc.nextLong();
        long diff = -1;
        long maxSum = -1;
        long minDiff = -1;
        long moneyEachChoice[] = new long[numsOfChoice];
        for (int i = 0; i < moneyEachChoice.length; i++) {
            moneyEachChoice[i] = sc.nextLong();
        }

        Arrays.sort(moneyEachChoice);

        int left = 0;
        int right = moneyEachChoice.length - 1;

        while (left < right) {
            long sum = moneyEachChoice[left] + moneyEachChoice[right];
            diff = moneyEachChoice[right] - moneyEachChoice[left];
            if (sum <= maxMoney) {
                left++;
                if (sum > maxSum) {
                    maxSum = sum;
                    minDiff = diff;
                } else if (sum == maxSum) {
                    if (diff < minDiff) {
                        minDiff = diff;
                    }
                }

            } else
                right--;
        }
        System.out.println(maxSum + " " + minDiff);
        sc.close();
    }
}
