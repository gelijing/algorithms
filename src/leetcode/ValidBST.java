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
        if (root == null) {
            return true;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                if (pre != null && pre.val >= root.val)
                    return false;
                pre = root;
                root = root.right;
            }
        }
        return true;
    }
    //法二
}