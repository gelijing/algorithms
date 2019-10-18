package tongcheng58Test;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(core(num));
    }

    private static int core(int num) {
        int[] a = new int[num+1];
        a[0] = 0;
        if(num > 0){
            a[1] = 1;
        }
        if(num > 1){
            a[2] = 2;
        }
        if(num >=3){
            for(int i = 3; i < a.length;i++ ){
                a[i] = a[i-1] + a[i-2];
            }
        }
        return a[num];
    }
}
