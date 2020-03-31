package duxiaomanTest;

import java.util.Scanner;

/**
 * 第一行输入两个整数 N、W（1 <= N、W <= 100000）。
 * 第二行输入 N 个整数 w[1] 到 w[N]（1 <= w[i] <= W）。
 * 第三行输入 N 个整数 t[1] 到 t[N]（1 <= t[i] <= 10000）。
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();// N 辆车
        int W = sc.nextInt();//最大承重为 W 的桥
        int[] w = new int[N];// 第 i 辆车的重量为 w[i]
        int[] t = new int[N];//通过桥的时间为 t[i]
        for (int i = 0; i < N; i++) {
            w[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            t[i] = sc.nextInt();
        }
        int time = core(w, t, W);
        System.out.println(time);
    }

    private static int core(int[] w, int[] t, int W) {
        int[] sum = new int[w.length];
        sum[0] = w[0];
        for (int i = 1; i < w.length; i++) {
            sum[i] = sum[i - 1] + w[i];
        }
        int[] f = new int[w.length];
        f[0] = t[0];
        for (int i = 1; i < w.length; ++i) {
            f[i] = t[i] + f[i - 1];
            for (int j = i - 1; j > 0; --j) {
                if (sum[i] - sum[j] <= W)
                    f[i] = Math.min(f[i], f[j - 1] + t[i]);
                else break;
            }
        }
        return f[w.length - 2];
    }
}
