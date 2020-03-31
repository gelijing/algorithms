package souhuTest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] l = new int[n];
        int[] r = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }
        System.out.println(part(l, r, m));
    }

    private static int part(int[] l, int[] r, int m) {
        int res = 0;
        int[][] dp = new int[30][200];
        dp[0][0] = 1;
        for (int i = 1; i <= l.length; i++) {
            for (int j = 0; j <= m; j++) {
                for (int k = l[i]; k <= r[i]; k++) {
                    if (j - k >= 0) {
                        dp[i][j] += dp[i - 1][j - k];
                    }
                }
            }
        }
        return dp[l.length][m];
    }
}
