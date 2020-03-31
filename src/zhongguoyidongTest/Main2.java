package zhongguoyidongTest;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(hasT(m,n,x,y));
    }

    private static String hasT(int m, int n, int x, int y) {
        if(Math.max(m,n) <= Math.min(x,y)){
            return "YES";
        }
        return "NO";
    }
}
