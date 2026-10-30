package week3;

import java.util.Scanner;

public class EISW3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String sub = null;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i+3>str.length()) {
                break;
            }
            sub = str.substring(i, i + 3); // Lấy từ vị trí 0 đến 2
            char a = str.charAt(i);
            char b = str.charAt(i + 1);
            char c = str.charAt(i + 2);
            if (a != b && a != c && b != c) {
                count++;
            }

        }
        System.out.println(count);
        sc.close();
    }
}
