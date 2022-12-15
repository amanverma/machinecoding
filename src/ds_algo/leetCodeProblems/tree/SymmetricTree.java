package ds_algo.leetCodeProblems.tree;

import java.util.LinkedList;
import java.util.Queue;

//Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
//tree is symmetric when two parts are mirror reflection of each other
/*
* Two trees are a mirror reflection of each other if:
Their two roots have the same value.
The right subtree of each tree is a mirror reflection of the left subtree of the other tree.

* */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
        // return isMirrorIterative(root);


    }

    private boolean isMirror(TreeNode root, TreeNode root2) {
        if(root==null && root2==null) return true;
        if(root==null || root2==null) return false;
        if(root.val!=root2.val) return false;
        return (isMirror(root.left, root2.right) && isMirror(root.right, root2.left));
    }

//Will be similar to BFS O(n) TC and SC
    private boolean isMirrorIterative(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode t1 = q.poll();
            TreeNode t2 = q.poll();
            if(t1==null && t2==null) return true;
            if(t1==null || t2==null) return false;
            if(t1.val !=t2.val) return false;
            q.offer(t1.left);
            q.offer(t2.right);
            q.offer(t1.right);
            q.offer(t2.left);
        }
        return true;

    }
}
