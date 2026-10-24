package week2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        List<Integer> keyList = new ArrayList<>(map.keySet());

        keyList.sort(null);

        for(int key : keyList){
            System.out.println(key+ " "+ map.get(key));
        }
        sc.close();
    }
}
