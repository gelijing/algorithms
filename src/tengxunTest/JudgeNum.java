package tengxunTest;

import java.util.Scanner;

/**
 * 2
 * 11
 * 88888888888
 * 3
 * 000
 */
public class JudgeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        String[] str = new String[t];
        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
            str[i] = sc.next();
        }
        String[] res = judge(arr, str);
        for (String b : res) {
            System.out.println(b);
        }
    }

    public static String[] judge(int[] arr, String[] str) {
        if (arr == null || arr.length <= 0
                || str == null || str.length <= 0 || arr.length != str.length) {
            return null;
        }
        String[] res = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 11) {
                res[i] = "NO";
                continue;
            }
            if (arr[i] == 11 && str[i].toCharArray().length == 11 && str[i].charAt(0) == '8') {
                res[i] = "YES";
                continue;
            }
            if (arr[i] > 11 && str[i].charAt(arr.length - 11) == '8') {
                res[i] = "YES";
                continue;
            }
            res[i] = "NO";
        }
        return res;
    }
}
