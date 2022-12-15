package ds_algo.leetCodeProblems.graph.unionDisjointSet;

import java.util.HashSet;

class Union {
    int[] root;
    int[] rank;

    int count;

    public Union(int n) {
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

    public int getDistinctRoots() {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i <root.length; i++){
            set.add(find(i));
        }
//        IntStream.of(root).forEach(x->
//                set.add(find(x)));
//        root[root.length-1] = find(root.length-1);
//        return (int)IntStream.of(root).distinct().count();
//        return set.size();
        return count;
    }
}