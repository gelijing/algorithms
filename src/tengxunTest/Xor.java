package tengxunTest;

import java.util.Scanner;

public class Xor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        int res = arr1[0] + arr2[0];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != 0 && j != 0) {
                    res = res ^ (arr1[i] + arr2[j]);
                }
            }
        }
        System.out.println(res);
    }
}
