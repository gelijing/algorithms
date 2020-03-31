package kedaxunfeiTest;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(core(n));
        }
    }

    /*private static int core(int n) {
        if(n==0 || n == 1){
            return 0;
        }
        int i = 0;
        int j = n;
        int sum = Integer.MIN_VALUE;
        while(i<j){
            if(i+j== n && i*j>sum){
                sum = i*j;
                i++;
                j--;
            }else if(i+j<n){
                i++;
            }else if(i+j>n){
                j--;
            }
        }
        return sum;
    }*/
    private static long core(int n) {
        if (n <= 0) {
            return 0;
        }
        long i = 0;
        long j = n;
        Long sum = Long.MIN_VALUE;
        while (i <= j) {
            if (i * j > sum) {
                sum = i * j;
            }
            i++;
            j--;
        }
        return sum;
    }
}
