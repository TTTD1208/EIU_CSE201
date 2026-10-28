package week2;

import java.util.Arrays;
import java.util.Scanner;

public class EiuGift1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        double[] gifts = new double[n];
        double[] papers = new double[m];
        int counts = 0;
        for (int i = 0; i < gifts.length; i++) {
            gifts[i] = sc.nextInt();
        }
        for (int i = 0; i < papers.length; i++) {
            papers[i] = sc.nextInt();
        }
        Arrays.sort(gifts);
        Arrays.sort(papers);
        int i = 0;
        int j = 0;
        while (i <= papers.length - 1 && j <= gifts.length - 1) {
            
            if ((papers[i] / gifts[j]) < 2) {
                i++;
            } else if ((papers[i] / gifts[j]) > 3) {
                j++;
            } else {
                i++;
                j++;
                counts++;}
            // }if (i == papers.length - 1 || j == gifts.length - 1) {
            //     break;
            // }
        }
        System.out.println(counts);sc.close();
    }
}
