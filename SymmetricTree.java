public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if(root ==null) return true;


        TreeNode left = root.left;
        TreeNode right = root.right;

        return symmetricHelper(left, right);
    }

    private boolean symmetricHelper(TreeNode left, TreeNode right) {
        if(left == null && right == null)
            return true;
        else if(left != null && right != null && left.val == right.val) {
            return symmetricHelper(left.left, right.right) && symmetricHelper(left.right, right.left);
        }
        else {
            return false;
        }
    }
}
