import javax.print.DocFlavor;

public class PathSumBT {

    public boolean hasPathSum(TreeNode root, int sum) {

        if(root == null)    return false;

        return pathSum(root, sum);
    }

    private boolean pathSum(TreeNode root, int sum) {



        return root.left == null && root.right == null && sum-root.val ==0 || pathSum(root.left, sum-root.val) || pathSum(root.right, sum-root.val);
    }

    public static void main(String[] args) {
        PathSumBT path = new PathSumBT();

    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}