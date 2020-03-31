package linkTable;

import leetcode.TreeNode;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * leetcode21 //merge两个有序链表
 */
public class MergeLinkedList {
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        while (listNode != null) {
            stack.add(listNode.val);
        }
        while (stack != null) {
            list.add(stack.pop());
        }
        return list;
    }

    public static void main(String[] args) {
        /*ListNode listNode = new ListNode(0);
        ArrayList<Integer> arrayList = printListFromTailToHead(listNode);*/
        System.out.println(JumpFloor(10));
        Queue<Integer> queue = new LinkedBlockingQueue<>();
    }

    public static int JumpFloor(int target) {
        if (target <= 2) {
            return target;
        }
        return JumpFloor(target - 1) + JumpFloor(target - 2);
    }

    public String ReverseSentence(String str) {
        Stack<String> stack = new Stack<>();
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        String res = "";
        while (!stack.empty()) {
            res += stack.pop() + " ";
        }
        return res;
    }
}
