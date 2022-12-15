package ds_algo.leetCodeProblems.graph.unionDisjointSet;

public class GraphValidTree {
    public boolean validTree(int n, int[][] edges) {
        Union2 u2 = new Union2(n);
        for(int i = 0 ; i <edges.length;i++){
            int rel[] = edges[i];
            if(rel[0]!=rel[1]){
                u2.union(rel[0], rel[1]);
            }
        }
        if(u2.getNumberOfConnectedComponents()==1 && edges.length==(n-1)){
            return true;
        }
        return false;

    }
}


class Union2 {
    int[] root;
    int[] rank;
    int count;

    public Union2(int n) {
        count = n;
        root = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            root[i] = i;
            rank[i] = 1;
        }
    }

    protected int find(int x) {
        if (root[x] == x) {
            return x;
        }
        return root[x] = find(root[x]); //path compression
    }

    protected void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        int rankX = rank[x];
        int rankY = rank[y];

        if (rootX != rootY) {
            if (rankX > rankY) {
                root[rootY] = rootX;
            } else if (rankX < rankY) {
                root[rootX] = rootY;
            } else {
                root[rootY] = rootX;
                rank[rootX] += 1;
            }
            count--;
        }
    }

    protected int getNumberOfConnectedComponents(){
        return count;
    }

}