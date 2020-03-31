package dahuaTest;

public class Test2 {
    String str = new String("dahua");
    char[] ch = {'a', 'b', 'c'};

    public static void main(String[] args) {
        Test2 ex = new Test2();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str + " and ");
        System.out.println(ex.ch);
        String a = "test";
        String b = a;
        a = "change";
        System.out.println(a + " " + b);//String 值引用
    }

    private void change(String str, char[] ch) {
        str = "test success";
        ch[0] = 'g';
    }
}
