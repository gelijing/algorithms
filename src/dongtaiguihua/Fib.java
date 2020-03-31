package dongtaiguihua;

/**
 * 斐波那契数列 0 1 2 3 5 8 13。。。
 * 记忆化搜索
 */
public class Fib {
    public static void main(String[] args) {
        System.out.println(fib(6));
    }

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
