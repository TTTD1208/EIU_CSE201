package week2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class DistinctValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        int times = sc.nextInt();
        for (int i = 0; i < times; i++) {
            int n = sc.nextInt();

            for (int y = 0; i < n; y++) {
                int num = sc.nextInt();
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            List<Integer> keyList = new ArrayList<>(map.keySet());
            keyList.sort(null);

            for (int key : keyList) {
                if (map.get(key) == 1) {
                    System.out.println(key);
                }
            }
        }
        sc.close();
    }
}
