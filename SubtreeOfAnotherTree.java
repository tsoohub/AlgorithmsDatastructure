public class SubtreeOfAnotherTree {

    public boolean isSubtree(TreeNode s, TreeNode t) {
        return preOrder(s, t);
    }

    boolean preOrder(TreeNode s, TreeNode t) {
        if(s ==null) return false;

        if(s.val ==t.val && traversalChecker(s, t)) {
            return true;
        }

        return preOrder(s.left, t) || preOrder(s.right, t);
    }

    private boolean traversalChecker(TreeNode sub, TreeNode t){
        if(sub ==null && t ==null) return true;
        if(sub ==null || t ==null) return false;

        if(sub.val ==t.val) {
            return traversalChecker(sub.left, t.left) && traversalChecker(sub.right, t.right);
        }
        else return false;
    }
}
