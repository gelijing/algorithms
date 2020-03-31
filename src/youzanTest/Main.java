package youzanTest;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(core(arr));
    }

    private static int core(int[] arr) {
        if (arr == null || arr.length < 1) {
            return -1;
        }
        if (arr.length == 1) {
            return 0;
        }
        Arrays.sort(arr);
        int len = arr.length - 1;
        int res = 0;
        while (Math.abs(arr[0] - arr[len]) > 1) {
            int temp = (arr[0] + arr[len]) / 2;
            int flag = (arr[0] + arr[len]) % 2;
            res += temp - arr[0];
            arr[0] = temp;
            arr[len] = flag == 1 ? temp + 1 : temp;
            Arrays.sort(arr);
        }
        return res;
    }
}
