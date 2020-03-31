package tongchengTest;

import java.util.Arrays;
import java.util.Scanner;

public class HaoTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(haoshi(arr));
    }

    private static int haoshi(int[] arr) {
        Arrays.sort(arr);
        int s = (int) (arr.length * 0.99) - 1;
        return arr[s];
    }
}
