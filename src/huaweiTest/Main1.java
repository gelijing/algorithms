package huaweiTest;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] arr = str.split(",");
        String line = printUrl(arr);
        System.out.println(line);
    }

    private static String printUrl(String[] arr) {
        if (arr == null || arr.length <= 1){
            return "/";
        }
        String res;
        String temp = arr[0];
        for(int i = temp.length()-1;i>=0;i--){
            if(temp.charAt(i) != '/'){
                temp = temp.substring(0,i+1);
                break;
            }
        }
        String temp1 = arr[1];
        for (int i = 0;i < temp1.length();i++){
            if(temp1.charAt(i) != '/'){
                temp1 = temp1.substring(i);
                break;
            }
        }
        res = temp +"/" + temp1;
        return res;
    }
}
