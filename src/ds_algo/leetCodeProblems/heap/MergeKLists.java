package ds_algo.leetCodeProblems.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode resultListNode = null;
        ListNode currListNode = null;
        PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return (o1.val- o2.val);
            }
        });
        //put all head nodes in the pq
        for(int i = 0 ; i < lists.length; i ++){
            if(lists[i]!=null){
                pq.add(lists[i]);
            }
        }

        if(pq.isEmpty()) return null;
        ListNode head = pq.peek();


        while(!pq.isEmpty()){
            ListNode temp = pq.poll();
            if(resultListNode==null){
                resultListNode = temp;
                currListNode = temp;
            }else{
                currListNode.next = temp;
                currListNode = currListNode.next;
            }
            // add next list node to pq
            if(temp.next!=null){
                pq.add(temp.next);
            }
        }

        return resultListNode;

    }
}
