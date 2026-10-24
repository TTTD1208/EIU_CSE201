package week1;

import java.util.Scanner;

public class eiuph010_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int value=0;
        int[] num = new int[n];
        int[] count = new int[1_000_001];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
            count[num[i]]++;
        }
        for (int i = 0; i< count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                value = i;
            }
        }
        System.out.println(value);
        System.out.println(max);
        sc.close();
    }
}
