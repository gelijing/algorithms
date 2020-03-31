package aiqiyiTest;

import java.util.Scanner;

/**
 * 假设有N个人要玩游戏，每轮游戏必须选出一个人当裁判，剩下的N-1个人作为玩家。
 * 现在第i个人要求作为玩家进行至少Ai轮游戏，那么至少需要进行多少轮游戏才能满足所有人的要求？
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] arr = new long[N];
        long right = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLong();
            right += arr[i];
        }
        System.out.println(count(arr, right, N));
    }

    public static long count(long[] arr, long right, int N) {
        long left = 0;
        long mid;
        long cnt = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (judge(mid, arr, N)) {
                cnt = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return cnt;
    }

    public static boolean judge(long mid, long[] arr, int N) {
        long ans = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] > mid) {
                return false;
            }
            ans += mid - arr[i];
        }
        return mid <= ans;
    }
}
