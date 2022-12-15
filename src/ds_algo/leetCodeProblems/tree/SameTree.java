package ds_algo.leetCodeProblems.tree;

import java.util.ArrayDeque;

//check if two trees are same or not
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val!=q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public boolean isSameTreeIterative(TreeNode p, TreeNode q){
        if(!check(p,q)) return false;
        ArrayDeque<TreeNode> dP = new ArrayDeque<>();
        ArrayDeque<TreeNode> dQ = new ArrayDeque<>();
        dP.addLast(p);
        dQ.addLast(q);
        while(!dP.isEmpty()){
            p = dP.removeFirst();
            q= dQ.removeFirst();
            if(!check(p,q)) return false;
            if(p!=null){
                if(!check(p.left, p.right)) return false;
                dP.addLast(p.left);
                dQ.addLast(q.left);

                if (!check(p.right, q.right)) return false;
                if (p.right != null) {
                    dP.addLast(p.right);
                    dQ.addLast(q.right);
                }
            }
        }
        return true;


    }
    public boolean check(TreeNode p, TreeNode q) {
        // p and q are null
        if (p == null && q == null) return true;
        // one of p and q is null
        if (q == null || p == null) return false;
        if (p.val != q.val) return false;
        return true;
    }
}
