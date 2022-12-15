package ds_algo.leetCodeProblems.graph.unionDisjointSet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class PairDS{
    int i;
    int j;
    public PairDS(int i , int j){
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}

public class MaxAreaOfIslands {
    public int maxAreaOfIsland(int[][] grid) {//mxn ---- This approach will always be used when there is mxn grid . In nxn , the prev approach will work
        // and there is no need to form below boundary conditions. We can consider it to be a graph with vertex, edges/relationships.
        int nr = grid.length;
        int nc = grid[0].length;
        boolean flag = false;
        Union3 u3 = new Union3(nc*nr);
        int[] visited = new int[nc*nr];
        Arrays.fill(visited,-1);
        Queue<PairDS> q = new LinkedList<>();
        for(int i = 0 ; i <nr; i++){
            for(int j = 0 ; j<nc; j++){
                if(grid[i][j]==1){
                    q.offer(new PairDS(i,j));
                    while(!q.isEmpty()){
                        PairDS pairDS = q.poll();
                        processAllNeighbours(pairDS,q, grid, u3, visited);

                    }
                    flag = true;
                }
            }
        }
        int max_area=0;
        if(flag){
            HashMap<Integer,Integer> map = new HashMap<>();
            u3.getMaxArea(map);

            for(int v: map.values()){
                max_area = Math.max(max_area, v);
            }
        }

        return max_area;

    }

    private void processAllNeighbours(PairDS pairDS, Queue<PairDS> q, int[][] grid, Union3 u3, int[] visited) {
        int i = pairDS.getI();
        int j = pairDS.getJ();
        int nr = grid.length;
        int nc = grid[0].length;
        visited[i*nc+j]=0;

        if(i+1<nr && grid[i+1][j]==1 && visited[(i+1)*nc+j]==-1){
            u3.union(i*nc+j, (i+1)*nc+j);
            q.offer(new PairDS(i+1,j ));
            visited[(i+1)*nc+j]=0;

        }

        if(i-1>=0 && grid[i-1][j]==1&& visited[(i-1)*nc+j]==-1){
            u3.union(i*nc+j, (i-1)*nc+j);
            q.offer(new PairDS(i-1,j));
            visited[(i-1)*nc+j]=0;
        }

        if(j+1<nc && grid[i][j+1]==1&& visited[(i)*nc+(j+1)]==-1){
            u3.union(i*nc+j, (i)*nc+(j+1));
            q.offer(new PairDS(i,j+1));
            visited[(i)*nc+(j+1)]=0;
        }

        if(j-1>=0 && grid[i][j-1]==1 && visited[(i)*nc+(j-1)]==-1){
            u3.union(i*nc+j, (i)*nc+(j-1));
            q.offer(new PairDS(i,j-1));
            visited[(i)*nc+(j-1)]=0;
        }

    }


}


