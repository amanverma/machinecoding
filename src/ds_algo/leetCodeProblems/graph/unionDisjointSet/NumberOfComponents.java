package ds_algo.leetCodeProblems.graph.unionDisjointSet;

class NumberOfComponents {
    public static int countComponents(int n, int[][] edges) {
        Union u = new Union(n);
        for(int i = 0; i < edges.length; i++){
            int[] rel = edges[i];
            if(rel[0]!=rel[1]){
                u.union(rel[0], rel[1]);
            }
        }
        return u.getDistinctRoots();


    }
    public static void main(String[] args) {
        int[][] edges =new int[3][2];
        int[] one = new int[]{0,1};
        int[] two = new int[]{2,3};
        int[] three = new int[]{1,2};
        edges[0] = one;
        edges[1] = two;
        edges[2] = three;
        System.out.println("the number of connected components are:   "+ countComponents(4,edges));
    }
}

//class Union{
//    int[] root;
//    int[] rank;
//
//    public Union(int n){
//        root = new int[n];
//        rank = new int[n];
//        for(int i = 0 ; i <n; i ++){
//            root[i]=i;
//            rank[i]=1;
//        }
//    }
//
//    public int find(int x){
//        if(root[x]==x){
//            return x;
//        }
//        return root[x] = find(root[x]);
//    }
//
//    public void union(int x, int y){
//        int rootX = find(x);
//        int rootY = find(y);
//        int rankX = rank[rootX];
//        int rankY = rank[rootY];
//        if(rootX!=rootY){
//            if(rankX>rankY){
//                root[rootY] = rootX;
//            }
//            else if(rankX<rankY){
//                root[rootX] = rootY;
//            }
//            else{
//                root[rootY] = rootX;
//                rank[rootX]+=1;
//            }
//        }
//    }
//    public int getConnectedComponents(){
//        return (int)IntStream.of(root).distinct().count();
//    }
//}