package ds_algo.leetCodeProblems.graph.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class NextRightPointers {
    public Node connect(Node root) {
        if(root==null){
            return null;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0 ; i < size; i++){
                Node n = q.poll();

                if(i<size-1) n.next = q.peek() ;
                if(n.left!=null){
                    q.offer(n.left);
                }

                if(n.right!=null){
                    q.offer(n.right);
                }
            }
        }
        return root;
    }

}
