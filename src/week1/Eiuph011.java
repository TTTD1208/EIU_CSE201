package week1;

import java.util.Scanner;

public class Eiuph011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int[] count = new int[1000001];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            count[num[i]]++;
            if (count[num[i]]==1) {
                System.out.print(num[i]+" ");
            }
        }
        sc.close();
    }
}
