package beikeTest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(core(n, p, k));
    }

    private static int core(int n, int p, int k) {
        if (n < 2) {
            return 0;
        }
        int res = 0;
        int i = 1;
        int j = n;
        while (i < j) {
            if ((i * i + j * j) % p == k) {
                res++;
            }
            i++;
            if ((i * i + j * j) % p == k) {
                res++;
            }
            j--;
            if ((i * i + j * j) % p == k) {
                res++;
            }
        }
        res = res * 2;
        for (int m = 1; m <= n; m++) {
            if (m * m * 2 % p == k) {
                res++;
                break;
            }
        }
        return res;
    }
}
