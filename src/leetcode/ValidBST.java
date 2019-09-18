package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 判断一棵树是否 二叉搜索树
 */
public class ValidBST {
    //法一：中序遍历
    public boolean isValidBST(TreeNode root) {
        if (root == null ){
            return true;
        }
        List<Integer> integers = inOrder(root);
        for (int i = 1 ; i < integers.size();i++){
            if (integers.get(i) <= integers.get(i-1)){
                return false;
            }
        }
        return true;
    }

    private List<Integer> inOrder(TreeNode node){
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while(node != null || !stack.isEmpty()){
            if (node != null){
                stack.push(node);
                node = node.left;
            }else{
                node = stack.pop();
                list.add(node.val);
                node = node.right;
            }
        }
        return list;
    }
    //法二
}