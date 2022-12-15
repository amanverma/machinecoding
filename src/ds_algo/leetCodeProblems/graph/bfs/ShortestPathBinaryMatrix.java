package ds_algo.leetCodeProblems.graph.bfs;


class Pair{
    int x;
    int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class ShortestPathBinaryMatrix {
//    TODO : Solve this question using three approaches - O(N), O(N) without alteration of grid, O(NLogN)
//    public int shortestPathBinaryMatrix(int[][] grid) {
//        int size = grid.length;
//        if(grid[0][0]!=0 || grid[size-1][size-1]!=0){
//            return 0;
//        }
//
//        HashMap<Integer, Pair> map = new HashMap<>();
//        map.put(0,new Pair(0,0));
//        for(int i = 0 ; i < grid.length; i++){
//            for( int j = 0 ; j <grid[0].length; j++){
//                int val = grid[i][j];
//                if(map.get(map.size()-1)==new Pair(size-1, size-1)){
//                    return map.size();
//                }
//                if(val==0 && i+1<grid.length-1){
//                    if(grid[i+1][j]==0){
//
//                    }
//                }
//
//            }
//        }
//
//    }
}
