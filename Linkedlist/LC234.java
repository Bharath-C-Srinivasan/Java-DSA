//234. Palindrome Linked List
/*Given the head of a singly linked list, return true if it is a palindrome or false otherwise. */

package Linkedlist;

public class LC234 {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head,
                 fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode p2 = reverse(slow);
        ListNode p1 = head;

        while(p1 != null && p2 != null){
            if(p1.val != p2.val){
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head){
        ListNode curr = head,
                 prev = null;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
