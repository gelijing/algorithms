package zhongguoyidongTest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(GCD(m,n));
        System.out.println(LCM(m,n));
    }
    private static int GCD(int a, int b) {
        if(b==0) return a;
        return a % b == 0 ? b : GCD(b, a % b);
    }
    private static int LCM(int a, int b) {
        return a * b / GCD(a, b);
    }
}
