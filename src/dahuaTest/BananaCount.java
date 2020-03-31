package dahuaTest;

import linkTable.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * 题目描述：
 * 有一堆糖果分给五个人，可以分出五份多一个，第一个人吃了一个，拿走其中的一份。剩下的分成五份多一个，
 * 第二个人吃了一个，拿走其中的一份，接下来三个人都是如此，问最少有多少糖果——利用递归和异常处理
 */
public class BananaCount {
    private static int num = 0;

    public static void main(String[] args) {
        System.out.println(part(1, 1));
    }

    /**
     * @param i 香蕉总数
     * @param j 小朋友id
     * @return
     */
    private static int part(int i, int j) {
        if (i % 5 == 1 && j <= 5) {
            if (j == 5) {
                return num;
            }
            return part((i - 1) / 5 * 4, ++j);
        } else {
            return part(++num, 1);
        }
    }

    public String replaceSpace(StringBuffer str) {
        String string = null;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                string += "20%";
                continue;
            }
            string += str.charAt(i);
        }
        return string;
    }


}
