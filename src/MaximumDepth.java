import java.util.LinkedList;

//Find maximum depth of binary tree
//Longest path from root to leaf
public class MaximumDepth {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public int iterativeMaxDepth(TreeNode root){
        LinkedList<TreeNode> list = new LinkedList<>();
        LinkedList<Integer> depths = new LinkedList<>();
        if(root==null) return 0;

        list.add(root);
        depths.add(1);
        int depth =0, current_depth =0;
        while(!list.isEmpty()){
            root = list.pollLast();
            current_depth = depths.pollLast();
            if(root!=null){
                depth = Math.max(depth, current_depth);

                list.add(root.left);
                depths.add(current_depth+1);

                list.add(root.right);
                depths.add(current_depth+1);
            }
        }
        return depth;
    }
}

/*Complexity of Above algo is O(N), Space -> O(Log(N)) or O(H)*/


//Iterative Approach

