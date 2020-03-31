package tongcheng58Test;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] temp = str.split(" ");
        int[] arr = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            arr[i] = Integer.valueOf(temp[i]);
        }
        System.out.println(core(arr));
    }

    private static int core(int[] arr) {
        if (arr == null || arr.length <= 0) {
            return 0;
        }
        int m = arr[0];
        int n = arr[1];
        int k = arr[2];
        if (n < m) {
            return 0;
        }
        int count = 0;
        for (int i = m; i <= n; i++) {
            count += numberOfk(i, k);
        }
        return count;
    }

    private static int numberOfk(int n, int k) {
        int count = 0;
        while (n > 0) {
            if (n % 10 == k) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }
}
