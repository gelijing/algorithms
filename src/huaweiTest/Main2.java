package huaweiTest;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strings = str.split(" ");
        core(strings);
    }

    private static void core(String[] strings) {
        if(strings == null){
            System.out.println("count: 0");
            return;
        }
        if(strings.length == 1){
            System.out.println("count: 1");
            System.out.println(strings[0]);
            return;
        }
        int max = 0;
        String res = null;
        for(int i = 0; i<strings.length;i++){
            int temp = Integer.parseInt(String.valueOf(strings[i].charAt(3)));
            String resTemp = strings[i];
            int count = 1;
            for(int j = i+1 ;j<strings.length;j++){
                if (temp <= Integer.parseInt(String.valueOf(strings[j].charAt(1)))){
                    temp = Integer.parseInt(String.valueOf(strings[j].charAt(1)));
                    resTemp += strings[j];
                    count++;
                }
            }
            if(max <= count){
                max = count;
                res = resTemp;
            }
        }
        System.out.println("count: "+max);
        System.out.println(res);
    }
}
