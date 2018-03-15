public class TiltBinaryTree {

    private int tilts = 0;

    public int findTilt(TreeNode root) {
        titlsHelper(root);
        return tilts;
    }

    private int titlsHelper(TreeNode node) {
        if(node ==null)
            return 0;

        int left = titlsHelper(node.left);
        int right = titlsHelper(node.right);

        tilts += Math.abs(left-right);
        return left + right + node.val;
    }
}