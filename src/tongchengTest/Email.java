package tongchengTest;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(encode(str));
    }

    private static StringBuffer encode(String str) {
        String[] strArr = str.split("@");
        StringBuffer stringBuffer = new StringBuffer();
        char[] ins = new char[]{'M', 'A', 'S', 'K'};
        char[] chars = strArr[0].toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            stringBuffer.append(String.valueOf(chars[i]) + String.valueOf(ins[i % 4]));
        }

        stringBuffer.append(String.valueOf(chars[chars.length - 1]) + "@" + strArr[1]);
        return stringBuffer;
    }
}
