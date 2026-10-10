//160. Intersection of Two Linked Lists
/*Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. 
If the two linked lists have no intersection at all, return null. */

package Linkedlist;

public class LC160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA,
                 curB = headB;

        while(curA != curB){
            curA = curA == null ? headB : curA.next;
            curB = curB == null ? headA : curB.next;
        }
        return curA;
    }

    public ListNode getIntersectionNodeOptimized(ListNode headA, ListNode headB) {
        ListNode curA = headA,
                 curB = headB;

        int lenA = 0, lenB = 0;

        while(curA != null){
            lenA++;
            curA = curA.next;
        }
        while(curB != null){
            lenB++;
            curB = curB.next;
        }

        curA = headA;
        curB = headB;

        int diff = Math.abs(lenA - lenB);

        if(lenA > lenB){
            int i = 0;
            curA = headA;
            while(i < diff){
                curA = curA.next;
                i++;
            }
        }else{
            int i = 0;
            curB = headB;
            while(i < diff){
                curB = curB.next;
                i++;
            }
        }

        while(curA != curB){
            curA = curA.next;
            curB = curB.next;
        }

        return curA;
    }
}
