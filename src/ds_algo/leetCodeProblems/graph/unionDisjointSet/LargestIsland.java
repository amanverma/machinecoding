package ds_algo.leetCodeProblems.graph.unionDisjointSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LargestIsland {
    //At each point where we encounter 0, make it 1 and compute size of largest island so far.
    public static int largestIsland(int[][] grid) {
        int nr = grid.length;
        int nc = grid[0].length;
        Union3 u3 = new Union3(nr*nc);
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    if (i + 1 < nr && grid[i + 1][j] == 1) {
                        u3.union(i * nc + j, (i + 1) * nc + j);
                    }

                    if (i - 1 >= 0 && grid[i - 1][j] == 1) {
                        u3.union(i * nc + j, (i - 1) * nc + j);
                    }

                    if (j + 1 < nc && grid[i][j + 1] == 1) {
                        u3.union(i * nc + j, (i) * nc + (j + 1));
                    }

                    if (j - 1 >= 0 && grid[i][j - 1] == 1) {
                        u3.union(i * nc + j, (i) * nc + (j - 1));
                    }
                }}}
        System.out.println("the number of islands in initial grid:  "+ u3.getNumberOfComponents());

        HashMap<Integer, Integer> map1 = new HashMap<>();
        u3.buildMapForCurrentGrid(map1);
        int largest_island_size = 0 ;
        for(int i = 0 ; i < grid.length; i++){
            for(int j = 0 ; j < grid[0].length; j++){
                int sum = 0;
                if(grid[i][j]==0){
                    if(i+1<nr){
                        sum+= u3.getCountFromMap((i+1)*nc+j, map1);
                    }
                    if(i-1>=0){
                        sum+= u3.getCountFromMap((i-1)*nc+j, map1);
                    }
                    if(j+1<nc){
                        sum+= u3.getCountFromMap((i)*nc+(j+1), map1);
                    }
                    if(j-1>=0){
                        sum+= u3.getCountFromMap((i)*nc+(j-1), map1);
                    }
                    sum+=1;

                    largest_island_size = Math.max(largest_island_size, sum);
                }
            }
        }
        return largest_island_size;
    }

    public static void main(String[] args) {
        int[][] grid = new int[2][2];
        int[] one = new int[]{0,1};
        int[] two = new int[]{1,0};
        grid[0] = one;
        grid[1] = two;
        System.out.println(largestIsland(grid));

    }
}

class Union3 {
    int[] root;
    int[] rank;

    int count;

    public void reset(int n) {
        count = n;
        for (int i = 0; i < n; i++) {
            root[i] = i;
            rank[i] = 1;

        }
    }

    public Union3(int n) {
        root = new int[n];
        rank = new int[n];
        count = n;
        for (int i = 0; i < n; i++) {
            root[i] = i;
            rank[i] = 1;

        }
    }

    public int find(int x) {
        if (root[x] == x) {
            return x;
        }
        return root[x] = find(root[x]);
    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if(rootX!=rootY){
            if (rank[rootX] > rank[rootY]) {
                root[rootY] = rootX;
            } else if (rank[rootX] < rank[rootY]) {
                root[rootX] = rootY;
            }
            if (rank[rootX] == rank[rootY]) {
                rank[rootX] += 1;
                root[rootY] = rootX;
            }
            count-=1;
        }
    }

    public boolean isConnected(int x, int y) {
        return find(x) == find(y);
    }

    public int getNumberOfComponents(){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < root.length; i++){
            int key = find(i);
            if(i!=key){
                set.add(key);
            }
        }
        return set.size();
    }

    public void buildMapForCurrentGrid(Map<Integer, Integer> map) {
        for(int i = 0 ; i <root.length; i++) {
            int key = find(i);
            if(i!=key){
                if (map.get(key) == null) {
                    map.put(key, 1);
                } else {
                    map.put(key, map.get(key) + 1);
                }
            }
        }
    }

    public void getMaxArea(HashMap<Integer, Integer> map) {
        for(int i = 0 ; i <root.length; i++){
            int key = find(i);
            if(map.get(key)==null){
                map.put(key, 1);
            }else{
                map.put(key, map.get(key)+1);
            }
        }
    }

    public int getCountFromMap(int value, Map<Integer, Integer> map) {
        if(map.size()>0 && map.keySet().contains(find(value))){
            return (map.get(value)!=null)?map.get(value):0;
        }
        return 0;
    }
}
