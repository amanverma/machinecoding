package ds_algo.leetCodeProblems.tree;

public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) {
             this.val = val;
             left = right = null;
         }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
}
/**
 * Definition for a binary tree node.
 * public class ds_algo.problems.TreeNode {
 *     int val;
 *     ds_algo.problems.TreeNode left;
 *     ds_algo.problems.TreeNode right;
 *     ds_algo.problems.TreeNode() {}
 *     ds_algo.problems.TreeNode(int val) { this.val = val; }
 *     ds_algo.problems.TreeNode(int val, ds_algo.problems.TreeNode left, ds_algo.problems.TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
