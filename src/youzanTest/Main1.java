package youzanTest;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        long[] arr = new long[T];
        for (int i = 0; i < T; i++) {
            arr[i] = sc.nextLong();
        }
        for (int i = 0; i < T; i++)
            System.out.println(core(arr[i]));
    }

    private static long core(long N) {
        long res = 0;
        long i = 1;
        long j = N;
        while (i <= j) {
            long temp = i * j + i + j;
            if (temp == N) {
                res++;
                i++;
                j--;
            } else if (temp < N) {
                i++;
            } else {
                j--;
            }
        }
        return res;
    }
}
