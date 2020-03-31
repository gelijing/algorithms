package guangdakejiTest;

import java.util.Scanner;
import java.util.Stack;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();//["2", "1", "+", "3", "*"]
        str = str.replaceAll(" ", "");
        str = str.substring(1, str.length() - 1);
        String[] strings = str.split(",");
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].substring(1, strings[i].length() - 1);
        }
        System.out.println(evalRPN(strings));
    }

    public static int evalRPN(String[] strs) {
        if (strs == null || strs.length == 0) {
            return 0;
        }
        if (strs.length == 1) {
            return Integer.parseInt(strs[0]);
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < strs.length; i++) {
            String temp = strs[i];
            if (temp.equals("+")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a + b);
            } else if (temp.equals("*")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a * b);
            } else if (temp.equals("-")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b - a);
            } else if (temp.equals("/")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b / a);
            } else {
                stack.add(Integer.parseInt(temp));
            }
        }
        return stack.pop();

    }
}
