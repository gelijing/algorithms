package digui;

/**
 * 226 反转一棵二叉树
 */
public class ReveseBinaryTree {
    public TreeNode invertTree(TreeNode root){
        if(root == null){
            return root;
        }
        root.left = invertTree(root.left);
        root.right = invertTree(root.right);
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
    }
}
