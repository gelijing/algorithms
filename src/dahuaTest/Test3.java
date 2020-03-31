package dahuaTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Test3 {
    public static void main(String[] args) {
        String str1 = "test";
        String str2 = "test";
        String str3 = new String("test");
        String str4 = new String("test");
        String str5 = new String("test");

        System.out.println(str1 == str2);//true
        System.out.println(str1 == str3);//false
        System.out.println(str3.equals(str4));//true

        Set hashSet = new HashSet();
        hashSet.add(str3);
        hashSet.add(str4);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        int i = (int) 4L;
        double d = 34.4;
        float f = (float) 1.10;
        long a = 13848654;
        ThreadLocal threadLocal = new ThreadLocal();


    }
}
