package ds_algo.leetCodeProblems.graph.dfs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class CloneGraph {
    private HashMap<Node, Node> map = new HashMap<>();
    public Node cloneGraphDFS(Node node) {

        if(node==null) return null;
        if(map.containsKey(node)){
            return map.get(node);
        }
        Node newNode = new Node(node.val);
        map.put(node, newNode);
        for(int i = 0 ; i < node.neighbors.size(); i++){
            newNode.neighbors.add(cloneGraphDFS(node.neighbors.get(i)));
        }

        return newNode;

    }
    public Node cloneGraphBFS(Node node) {
        if(node==null){
            return node;
        }
        Queue<Node> q = new LinkedList<>();
        HashMap<Node, Node> cache = new HashMap<>();

        q.offer(node);
        Node newNode = new Node(node.val);
        cache.put(node, newNode);
        while(!q.isEmpty()){
            Node n = q.poll();
            for(Node neighbour : n.neighbors){
                if(cache.containsKey(neighbour)){
                    return cache.get(neighbour);
                }
                q.offer(neighbour);
                cache.put(neighbour, new Node(neighbour.val));
                cache.get(n.neighbors.add(cache.get(neighbour)));
            }

        }
        return cache.get(node);

    }
}
