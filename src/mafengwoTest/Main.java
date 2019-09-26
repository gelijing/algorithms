package mafengwoTest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String[] split = n.split(",");
        int[] arr = new int[split.length];
        for (int i = 0; i < split.length ; i++){
            arr[i] = Integer.parseInt(split[i]);
        }
        int threshold = sc.nextInt();
        System.out.println(42==42.0);//true 自动装拆箱
        //System.out.println(minThreshold(arr,threshold));
    }
    public static int minThreshold(int[] arr,int threshold){
        int res = 0;
        for (int i = 0 ; i < arr.length;i++){
            int sum = arr[i];
            if (sum < threshold){
                res ++;
            }else {
                continue;
            }
            for (int j = i+1;j<arr.length;j++){
                sum = sum * arr[j];
                if (sum < threshold ){
                    res++;
                }else{
                    break;
                }
            }
        }
        return res;
    }
}
