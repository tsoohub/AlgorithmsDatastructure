public class SumOfLeftTree {

    private int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        helper(root, false);
        return sum;
    }

    private void helper(TreeNode root, boolean isLeft) {
        if (root == null) {
            return;
        }
        if (isLeft == true && root.left == null && root.right == null) {
            sum += root.val;
        }
        helper(root.left, true);
        helper(root.right, false);
    }
}
