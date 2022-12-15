package ds_algo.leetCodeProblems.tree;

/**
 * Definition for a binary tree node.
 * public class ds_algo.problems.TreeNode {
 *     int val;
 *     ds_algo.problems.TreeNode left;
 *     ds_algo.problems.TreeNode right;
 *     ds_algo.problems.TreeNode() {}
 *     ds_algo.problems.TreeNode(int val) { this.val = val; }
 *     ds_algo.problems.TreeNode(int val, ds_algo.problems.TreeNode left, ds_algo.problems.TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
//TC - O (n) and SC = O(log n) as recursion stack only requires O(log n ) space for height balanced tree.
class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        int length = nums.length;
        int mid;
        if(length%2==0){
            mid = length/2;
        }else{
            mid = length/2+1;
        }
        return makeTree(nums, 0, nums.length-1);

    }
    public TreeNode makeTree(int[] nums, int start, int end){
        if(start<=end){
            int mid = (start+end)/2;
            TreeNode node = new TreeNode(nums[mid]);
            node.left = makeTree(nums, start, mid-1);
            node.right = makeTree(nums, mid+1, end);
            return node;
        }

        return null;
    }

    public TreeNode sortedListToBST(ListNode head) {
        int length = 0 ;
        ListNode temp = head;
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        return makeTree(head, 0, length);
    }

    public TreeNode makeTree(ListNode head, int start, int end) {
        if(start<=end){
            int mid = (start+end)/2;
            TreeNode left = makeTree(head, start, mid-1);

            TreeNode node = new TreeNode(head.val);
            node.left = left;




            node.right = makeTree(head, mid+1, end);
            head = head.next;


            return node;
        }
        return null;
    }

}