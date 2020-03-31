package xindongfangTest;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //这里可以编写伪代码，不管是否编译通过
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] split = str.split("]");
        int[][] arr = new int[split.length - 1][3];
        char[] chars = str.toCharArray();
        /*for (int i = 0;i<split.length-1;i++){
            for (int j = 0 ; j < 3; j++){
                if (chars[i] != ',' || chars[i] != '['
                        || chars[i] != ']'){
                    for (int j = 0 ; j < 3;j++){
                        arr[i][j] =
                    }
                }
            }
        }*/
        arr2Json(arr);
    }

    private static void arr2Json(int[][] blogList) {
        StringBuffer sb = new StringBuffer();
        boolean first = true;
        sb.append("[");
        for (int i = 0; i < blogList.length; i++) {
            int[] blogItem = blogList[i];
            if (!first) {
                sb.append(",");
            }
            sb.append("{");
            sb.append("id: '" + blogItem[0] + "', ");
            sb.append("pid: '" + blogItem[1] + "', ");
            sb.append("data: '" + blogItem[2] + "' ");
            sb.append("children: '" + blogItem[3] + "' ");
            sb.append("}");
            first = false;
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}
