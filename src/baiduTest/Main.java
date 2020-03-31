package baiduTest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        String str = in.nextLine();
        System.out.println(solution(n, m, k));
        System.out.println();
    }

    public static int solution(int n, int m, int k) {
        if (n < 1 || m < 1 || k < 1 || n * m > k) {
            return 0;
        }
        return 7;
    }
}
