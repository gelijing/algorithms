package dahuaTest;

import dahuaTest.Test4;

public class Test5 extends Test4 {
    static {
        System.out.println("c");
    }

    public Test5() {
        System.out.println("d");
    }
}
