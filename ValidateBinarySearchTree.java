public class ValidateBinarySearchTree {

    public boolean isValidBST(TreeNode root) {
        if(root ==null)
            return true;

        if(root.left != null && root.val <= root.left.val ) {
            return false;
        }
        else if(root.right != null && root.val >= root.right.val ) {
            return false;
        }

        return isValidBST(root.left) && isValidBST(root.right);
    }


    public static void main(String[] args) {
        ValidateBinarySearchTree valid = new ValidateBinarySearchTree();


    }
}
