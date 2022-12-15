package ds_algo.leetCodeProblems.tree;

public class ValidBST {
    public boolean isValidBST(TreeNode root) {
        return isValidBSTSolution(root, null, null);

    }

    public boolean isValidBSTSolution(TreeNode root, Integer low, Integer high) {
        if (root == null) {
            return true;
        }
        if ((low != null && root.val <= low) || (high != null && root.val >= high)) {
            return false;
        }

        return isValidBSTSolution(root.left, low, root.val) && isValidBSTSolution(root.right, root.val, high);
    }
}