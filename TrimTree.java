public class TrimTree {

    public TreeNode trimBST(TreeNode root, int L, int R) {

        return trimHelper(root, L, R);
    }

    private TreeNode trimHelper(TreeNode node, int L, int R) {
        if(node ==null) return null;

        node.left = trimHelper(node.left, L, R);
        node.right = trimHelper(node.right, L, R);

        if(node.val < L)        return node.right;
        else if(node.val > R)   return node.left;
        else                    return node;
    }
}
