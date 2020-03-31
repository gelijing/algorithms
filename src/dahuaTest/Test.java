package dahuaTest;

public abstract class Test {
    private final void sleep() {
    }

    /*private*/
    abstract void eat();//abstract不能和private并列修饰同一个方法

    public /*final*/ abstract void play();//abstract不能和final并列修饰同一个方法

    protected abstract void work();//要加入abstract

    //静态代码块（且只执行一次） 》代码块 》 构造函数 》
    //父类静态代码块和静态变量(顺序执行) 》子类静态代码块和静态变量》父类构造代码块》父类构造方法》子类构造代码块》子类构造方法
    /*static int x = 10;
    static{
        x+=5;
    }
    public static void main(String args[]){
        System.out.println("X="+x);
    }
    static {
        x/=3;
    }*/
}
