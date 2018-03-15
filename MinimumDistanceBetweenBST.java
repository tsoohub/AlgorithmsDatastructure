public class MinimumDistanceBetweenBST {
    int min = Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {

        if(root ==null) return 0;

        preOrder(root, root);

        return min;
    }

    private void preOrder(TreeNode root, TreeNode node) {
        if(node ==null) return;

        minDiff(root, node.val);

        preOrder(root, node.left);
        preOrder(root, node.right);
    }

    private void minDiff(TreeNode node, int val) {

        if(node ==null) return;

        if(node.val != val && Math.abs(node.val-val) < min) {
            min = Math.abs(node.val-val);
        }
        minDiff(node.left, val);
        minDiff(node.right, val);
    }
}
