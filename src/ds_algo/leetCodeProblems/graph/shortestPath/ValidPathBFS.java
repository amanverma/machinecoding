package ds_algo.leetCodeProblems.graph.shortestPath;

import java.util.*;
import java.util.stream.Collectors;

class ValidPathBFS {
    public boolean validPath(int n, int[][] edges, int source, int destination)
    {
        if(source==destination){
            return true;
        }
        HashMap<Integer, List<Integer>> graph = new HashMap<>();

        for(int i = 0 ; i < edges.length; i++){
            int[] pair = edges[i];
            int from = pair[0];
            int to = pair[1];
            if(!(graph.containsKey(from))){
                graph.put(from, Arrays.stream(new int[]{to}).boxed().collect(Collectors.toList()));
            }else{
                graph.get(from).add(to);
            }
            if(!graph.containsKey(to)){
                graph.put(to, Arrays.stream(new int[]{from}).boxed().collect(Collectors.toList()));
            }else{
                graph.get(to).add(from);
            }
        }
        for(int i = 0 ; i < graph.size(); i++){
            System.out.println(i +"  ----> " + graph.get(i));
        }
        System.out.println(graph.size());

        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        q.offer(source);
        while(!q.isEmpty())
        {
            int val = q.poll();
            if(visited.contains(val)) continue;
            if(val == destination) return true;
            visited.add(val);
            List<Integer> neighbours = graph.get(val);
            neighbours.stream().forEach(x->{
                q.offer(x);
            });
        }
        return false;
    }
}

