package ds_algo.leetCodeProblems.tree;

import java.util.ArrayList;
import java.util.List;

/*For a given integer n , construct all unique BSTs
* This would be a catalan number 2n!/n!*(n+1)! -> 1,1,2,4,429....
* Approach -> 
*   - Recursively Construct Trees for i -> 1 to N => considering each i  as root.
*       - Create a ds_algo.problems.TreeNode for ith position
*       - Join left tree and right trees for current ith position 
*       - add to list of trees.
*   - return list
* 
* */
public class UniqueBST2 {
    public static List<TreeNode> allTrees = new ArrayList<>();
    public static void main(String[] args) {
        generateUniqueBST(1,5);

        for(int i = 0 ; i <5; i++){
            //generateUniqueBST(i);
        }

    }

    private static List<TreeNode> generateUniqueBST(int start, int end) {
        if(start>end){
            allTrees.add(null);
            return allTrees;
        }
        for(int i = start; i < end; i++){
            List<TreeNode> leftTrees = generateUniqueBST(start, i-1);
            List<TreeNode> rightTrees = generateUniqueBST(i+1, end);

            TreeNode node = new TreeNode(i);
            for(int j = 0 ; j < leftTrees.size(); j++){
                for( int k = 0 ; k < rightTrees.size(); k++){
                    node.left = leftTrees.get(j);
                    node.right = rightTrees.get(k);
                }
            }
            allTrees.add(node);

        }
        return allTrees;
    }

}
