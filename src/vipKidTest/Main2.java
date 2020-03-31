package vipKidTest;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(countOne(num));
    }

    private static int countOne(int num) {
        int res = 0;
        while (num != 0) {
            res++;
            num = num & (num - 1);
        }
        return res;
    }
}
