
public class FindBottomLeftTree {


    int leftMost = 0;

    public int findBottomLeftValue(TreeNode root) {
        if(root.left ==null && root.right ==null)
            return root.val;

        helperFindLeftMost(root, 0, 0, false);
        return leftMost;
    }

    void helperFindLeftMost(TreeNode node, int level, int leftMostLevel, boolean isLeft) {

        if(node ==null)
            return;

        if(isLeft && node.left == null && node.right == null && level > leftMostLevel) {
            leftMostLevel = level;
            leftMost = node.val;
        }

        helperFindLeftMost(node.left, level + 1, leftMostLevel, true);
        helperFindLeftMost(node.right, level + 1, leftMostLevel, false);
    }
}
