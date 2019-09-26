package tongchengTest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        System.out.println(transform(n));
    }

    private static String transform(long n) {
        StringBuffer sb = new StringBuffer();
        long jinzhi = 27;
        boolean f = true;
        char[] arr = new char[]{'0','1','2','3','4','5','6','7','8','9','`','!','@','#','$','%','^','&','*','(',')','{','}','\\','<','>','?'};
        while (f) {
            sb.insert(0,arr[(int) (n % jinzhi)]);
            //sb.insert(0, ((char) (n % jinzhi + 33)));
            n = n / jinzhi;
            if (n == 0)
                f = false;
        }
        /*for (int i = sb.length(); 4 - i > 0; i++) {
            sb = new StringBuffer("0" + sb);
        }*/
        return sb.toString();
    }
}
