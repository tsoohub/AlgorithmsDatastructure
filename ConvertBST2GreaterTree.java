public class ConvertBST2GreaterTree {

    public TreeNode convertBST(TreeNode root) {

        return convertHelper(root, root);
    }

    private TreeNode convertHelper(TreeNode node, TreeNode root) {
        if(node ==null)
            return null;

        int sum = 0;
        findGreaterSum(node.val, root, sum);
        node.val += sum;

        convertHelper(node.left, root);
        convertHelper(node.right, root);

        return node;
    }

    private void findGreaterSum(int cval, TreeNode root, int sum) {
        if(root ==null)
            return;

        if(root.val > cval)
            sum += root.val;

        findGreaterSum(cval, root.left, sum);
        findGreaterSum(cval, root.right, sum);

    }
}
