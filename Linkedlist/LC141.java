//141. Linked List Cycle
/*Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again 
by continuously following the next pointer. Internally, pos is used to denote the index of the 
node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false. */

package Linkedlist;

import java.util.HashSet;
import java.util.Set;

public class LC141 {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        ListNode curr = head;
        while(curr != null){
            if(set.contains(curr)){
                return true;
            }
            set.add(curr);
            curr = curr.next;
        }
        return false;
    }

    public boolean hasCycleOptimized(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }

        return false;
    }
}
