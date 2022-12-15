package ds_algo.leetCodeProblems.graph.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NaryLevelOrderTraversal {
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> resultList = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        if(root==null) return resultList;


        q.offer(root);

        while(!q.isEmpty()){
            List<Integer> tempList = new ArrayList<>();
            int qSize = q.size();
            for(int k = 0 ; k < qSize; k++){
                Node n= q.poll();
                tempList.add(n.val);
                q.addAll(n.children);
            }
            resultList.add(tempList);
        }
        return resultList;
    }
}
