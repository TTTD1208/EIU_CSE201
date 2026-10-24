package week1;

import java.util.Scanner;

public class EIUDOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counts = 0;
        int qi;
        int pi;

        for (int i = 0; i < n; i++) {
            qi = sc.nextInt();
            pi = sc.nextInt();

            if (qi+2<=pi) {
                counts++;
            }
        }

        System.out.println(counts);
        sc.close();
    }
}
