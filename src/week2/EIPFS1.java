package week2;

import java.util.Scanner;

public class EIPFS1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mainArr = new int[n];
        int[] pre = new int[n];
        for (int i = 0; i < mainArr.length; i++) {
            mainArr[i] = sc.nextInt();
        }
        for (int j = 0; j < mainArr.length; j++) {
            if (j==0) {
                pre[j] = mainArr[j];
            }
            if (j>0) {
                pre[j] = mainArr[j]+pre[j-1];
            }
        }
        for(int i =0 ; i <pre.length; i++){
            System.out.println(pre[i]);
        }sc.close();
    }
}
