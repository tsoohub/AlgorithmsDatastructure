public class BalancedBinaryTree {




    public boolean isBalanced(TreeNode root) {
        if(root ==null) return true;

        return heigth(root) != -1;
    }

    private int heigth(TreeNode node) {
        if(node ==null) // external node
            return 0;

        int left = heigth(node.left);
        if(left ==-1)
            return -1;

        int right = heigth(node.right);
        if(right ==-1)
            return -1;

        int h = Math.abs(left - right);
        if(h > 1)
            return -1;

        return Math.max(left, right) + 1;
    }
}
