package ds_algo.leetCodeProblems.graph.unionDisjointSet;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class DisjointSet {
    //DFS Approach
    public static int findCircleNumDFS(int[][] isConnected) {
        //find number of connected components
        int count = 0;
        int[] visited = new int[isConnected.length]; //size will be number of nodes
        Arrays.fill(visited, -1);
        for(int i = 0 ; i < isConnected.length; i ++){
            if(visited[i]==-1){
                visited[i]=0;
                dfs(visited, i , isConnected);
                count++;
            }
        }
        return count;

    }

    public static void dfs(int[] visited, int i, int[][] isConnected){
        for(int j = 0 ; j <isConnected[0].length; j++){
            if(visited[j]==-1 && isConnected[i][j]==1){
                visited[j]=0;
                dfs(visited, j, isConnected);
            }
        }
    }

    //BFS Appraoch
    public static int findCircleNumBFS(int[][] isConnected) {
        //find number of connected components
        int n = isConnected.length;
        int count = 0;
        Queue<Integer> q = new LinkedList<>();
        int[] visited = new int[n];
        Arrays.fill(visited,-1);
        for(int i = 0 ; i <n; i ++){
            if(visited[i]==-1){
                q.offer(i);
                visited[i]=0;
                while(!q.isEmpty()){
                    int e = q.poll();
                    for(int j = 0 ; j < isConnected[0].length; j++){
                        if(visited[j]==-1 && isConnected[i][j]==1){
                            q.offer(j);
                            visited[j]=0;
                        }
                    }
                }
                count++;
            }

        }
        return count;
    }

    /////////Union Disjoint Approach
    public static int findCircleNum(int[][] isConnected) {
        //find number of connected components
        int size = isConnected.length;
        Union u = new Union(size);
        for(int i = 0 ; i <size; i++){
            int[] element = isConnected[i];
            for(int j= 0 ; j < element.length; j++){
                if(i!=j && element[j]==1){
                    u.union(i, j);
                }
            }
        }

        return u.getDistinctRoots();
}

    public static void main(String[] args) {
        int[][] isConnected =new int[3][3];
//        [0,1,0,0,0,0,0,1,0,1],
//        [1,0,0,0,0,0,0,0,0,0],
//        [0,0,0,0,0,0,1,0,0,0],
//        [0,0,0,0,0,0,0,0,0,0],
//        [0,0,0,0,0,0,0,0,0,0],
//        [0,0,0,0,0,0,0,0,0,0],
//        [0,0,1,0,0,0,0,1,0,0],
//        [1,0,0,0,0,0,1,0,0,0],
//        [0,0,0,0,0,0,0,0,0,1],
//        [1,0,0,0,0,0,0,0,1,0]
        int[] one = new int[]{1,1,1};
        int[] two = new int[]{1,1,1};
        int[] three = new int[]{1,1,1};
        isConnected[0] = one;
        isConnected[1] = two;
        isConnected[2] = three;
        System.out.println("the number of connected components are:   "+ findCircleNumBFS(isConnected));
    }

}