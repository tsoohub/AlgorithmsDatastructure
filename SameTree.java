public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return false;

    }

    private boolean sameHelper(TreeNode p, TreeNode q) {
        if(p !=null && q != null)
        {
            if(p.val == q.val)
                return sameHelper(p.left, q.left) && sameHelper(p.right, q.right);
            else
                return false;
        }
        else
            return false;
    }
}
