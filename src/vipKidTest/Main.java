package vipKidTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            String str = s.replaceAll(" ", "");
            String[] temp = str.split(",");
            long[] arr = new long[temp.length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Long.valueOf(temp[i]);
            }
            System.out.println(twoSum(arr));
        }
    }

    private static long twoSum(long[] arr) {
        if (arr == null || arr.length <= 0) {
            return 0;
        }
        HashMap<Long, Integer> map = new HashMap<>();
        HashMap<Long, Long> res = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.get(0 - arr[i]) != null) {
                res.put(arr[i], -arr[i]);
                res.put(-arr[i], arr[i]);
            } else {
                map.put(arr[i], i);
            }
        }
        return res.size() / 2;
    }
}
