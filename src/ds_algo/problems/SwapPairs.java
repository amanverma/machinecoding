package ds_algo.problems;

public class SwapPairs {
    //1,2,3,4 -> 2,1,4,3
    public static ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode first = head;
        ListNode second = head.next;
        first.next = swapPairs(second.next);
        second.next = first;
        return second;
    }
    public static void main(String[] args){
        ListNode four = new ListNode(4,null);
        ListNode three = new ListNode(3,four);
        ListNode two = new ListNode(2,three);
        ListNode one = new ListNode(1,two);
        ListNode temp = swapPairs(one);
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
