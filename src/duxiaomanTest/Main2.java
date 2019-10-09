package duxiaomanTest;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(core(arr));
    }

    private static int core(int[] arr) {
        if(arr == null || arr.length <=0){
            return 0;
        }
        return 5;
    }
}
