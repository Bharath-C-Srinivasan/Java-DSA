//206. Reverse Linked List
/*Given the head of a singly linked list, reverse the list, and return the reversed list. */

package Linkedlist;

public class LC206 {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
