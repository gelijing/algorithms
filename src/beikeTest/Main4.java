package beikeTest;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[M];
        int[] brr = new int[M];
        for (int i = 0; i < M; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < M; i++) {
            brr[i] = sc.nextInt();
        }
        System.out.println(core(arr, brr, N, M));
    }

    private static int core(int[] arr, int[] brr, int n, int m) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum != n) {
            return -1;
        }
        quickSort(brr, arr, 0, arr.length - 1);
        int res = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            res = res * (jiecheng(n - brr[i]) / jiecheng(arr[i] - 1));
            n = n - arr[i];
        }
        return res;
    }

    private static int jiecheng(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        return res % (10 ^ 9 + 7);
    }

    private static void quickSort(int[] arr, int[] brr, int low, int high) {
        int i, j, temp, t;
        if (low > high) {
            return;
        }
        i = low;
        j = high;
        temp = arr[low];

        while (i < j) {
            while (temp <= arr[j] && i < j) {
                j--;
            }
            while (temp >= arr[i] && i < j) {
                i++;
            }
            if (i < j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
                t = brr[j];
                brr[j] = brr[i];
                brr[i] = t;
            }

        }
        arr[low] = arr[i];
        arr[i] = temp;
        quickSort(arr, brr, low, j - 1);
        quickSort(arr, brr, j + 1, high);
    }

}
