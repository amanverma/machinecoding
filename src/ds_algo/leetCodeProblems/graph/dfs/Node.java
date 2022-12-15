package ds_algo.leetCodeProblems.graph.dfs;

import java.util.ArrayList;
import java.util.List;

/*Return a deep copy of a given graph with it's root GraphNode*/
//Approaches - DFS, BFS
// Definition for a GraphNode.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
