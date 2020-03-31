package qunawang;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n + 1; i++) {
            System.out.println(fc(n, i));
        }

    }

    private static HashMap<String, Integer> hashMap =
            new HashMap<>();

    public static int fc(int m, int n) {
        if (m == 0) {
            return 1;
        }
        if (n == 0 || n == m) {
            return 1;
        }
        if (hashMap.get("" + m + n) != null) {
            return fc(m, n);
        }
        hashMap.put("" + m + n, fc(m - 1, n - 1));
        return fc(m - 1, n - 1) + fc(m - 1, n);
    }
}
