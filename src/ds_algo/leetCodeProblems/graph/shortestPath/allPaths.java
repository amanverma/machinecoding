package ds_algo.leetCodeProblems.graph.shortestPath;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class allPaths {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) { // 0 to n-1
        if(graph ==null || graph.length==0){
            return null;
        }
        Queue<List<Integer>> q = new LinkedList<>();
        List<Integer> path = new ArrayList<>();
        path.add(0);
        q.offer(path);
        List<List<Integer>> allPaths = new ArrayList<>();
        while(!q.isEmpty()){
            List<Integer> currentPath = q.poll();
            int curr_node = currentPath.get(currentPath.size()-1);
            for(int node : graph[curr_node]){
                List<Integer> tmpPath = new ArrayList<>(currentPath);
                tmpPath.add(node);
                if(tmpPath.get(tmpPath.size()-1)==graph.length-1) {
                    allPaths.add(tmpPath);
                }else{
                    q.add(new ArrayList<>(tmpPath));
                }
            }
        }
        return allPaths;

    }
}

