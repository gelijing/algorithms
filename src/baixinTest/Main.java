package baixinTest;

import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        /*for (int i = 0; i < args.length;i++){
            args[2] = "B";
        }
        for (int i = 0 ; i < args.length;i++){
            System.out.println(args[i]);
        }*/
        /*String t = "you have an apple";
        System.out.println(t.length());*/
        String filename = "a.txt";
        try {
            FileOutputStream out = new FileOutputStream(filename);
            out.write('A');
            out.write(65);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
