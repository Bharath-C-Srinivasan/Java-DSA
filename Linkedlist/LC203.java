//203. Remove Linked List Elements
/*Given the head of a linked list and an integer val, remove all the nodes of the linked list 
that has Node.val == val, and return the new head. */

package Linkedlist;

public class LC203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode pHead = new ListNode(0);
        pHead.next = head;

        ListNode prev = pHead,
                 cur = head;

        while(cur != null){
            if(cur.val == val){
                prev.next = cur.next;
            }else{
                prev = cur;
            }
            cur = cur.next;
        }

        return pHead.next;
    }
}
