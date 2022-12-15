package ds_algo.leetCodeProblems.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
public class InOrderTraversal {
    List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
//        inOrderRecursive(root);
//
//        return list;

        return inOrderIterative(root);

    }

    private List<Integer> inOrderIterative(TreeNode root) {
        Stack<TreeNode> s1 = new Stack();
        List<Integer> list1 = new ArrayList<>();
        TreeNode temp = root;
        while(temp!=null || !s1.isEmpty()){
            while(temp!=null){
                s1.push(temp);
                temp = temp.left;
            }
            temp = s1.pop();
            list.add(temp.val);
            temp = temp.right;

        }
        return list1;
    }

    public void inOrderRecursive(TreeNode root){
        if(root==null){
            return;
        }

        inOrderRecursive(root.left);
        list.add(root.val);
        inOrderRecursive(root.right);

    }

}
