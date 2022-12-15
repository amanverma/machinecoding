package ds_algo.problems;

//WAP to merge two sorted lists /Input: node1 = [1,2,4], node2 = [1,3,4]
//Output: [1,1,2,3,4,4]/
public class MergeLists {
    //brute force -> create third list , keep i,j pointers on two lists.

    //Recursive Solution
    public static ListNode mergeTwoLists(ListNode node1, ListNode node2) {
        if(node1==null) return node2;
        else if(node2==null) return node1;

       else  if(node1.val < node2.val){
            node1.next = mergeTwoLists(node1.next, node2);
            return node1;
        }
        else{
            node2.next = mergeTwoLists(node1, node2.next);
            return node2;
        }
    }

    //Iterative Solution
    public static ListNode iterativeMergeSortedLists(ListNode node1, ListNode node2){
        ListNode tempNode = new ListNode(-1, null);
        ListNode node = tempNode;
        while(node1!=null && node2!=null){
            if(node1.val<=node2.val){
                tempNode.next = node1;
                node1 = node1.next;
            }else{
                tempNode.next = node2;
                node2 = node2.next;
            }
            tempNode= tempNode.next;
        }

        if(node1==null){
            tempNode.next=node2;
        }else{
            tempNode.next=node1;
        }

        return node.next;
    }



    public static void main(String[] args){
        //node1
        ListNode four = new ListNode(4,null);
        ListNode two = new ListNode(2,four);
        ListNode one = new ListNode(1,two);


        //node2
        ListNode four_ = new ListNode(4,null);
        ListNode three_ = new ListNode(3,four_);
        ListNode one_ = new ListNode(1,three_);

        //ds_algo.problems.ListNode res = mergeTwoLists(one, one_);
        ListNode res = iterativeMergeSortedLists(one, one_);



        while(res!=null){
            System.out.println(res.val);
            res = res.next;
        }
    }
}
