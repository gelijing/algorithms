package aiqiyiTest;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        str16HexToDigit(str);
    }

    public static long str16HexToDigit(String str){
        int len = str.length();
        long sum = 0;
        for(int i = 0; i<len;i++){
            char c = (char)str.charAt(len-1-i);
            int n = Character.digit(c,16);
            sum += n*(1<<(4*i));
        }
        return sum;
    }
}
