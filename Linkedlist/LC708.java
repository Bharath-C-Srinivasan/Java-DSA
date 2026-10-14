//LeetCode 708: Insert into a Sorted Circular Linked List (Medium / Premium)
/*Given a node from a Circular Linked List which is sorted in non-decreasing order, 
write a function to insert a value insertVal into the list such that it remains a sorted circular linked list. */

package Linkedlist;

public class LC708 {
    public ListNode insert(ListNode head, int insertVal){
        if(head == null){
            ListNode node = new ListNode(insertVal);
            node.next = node;
            return node;
        }
        ListNode prev = head, curr = head.next;

        do{
            if(insertVal >= prev.val && insertVal <= curr.val){
                ListNode node = new ListNode(insertVal);
                prev.next = node;
                node.next = curr;
                return head;
            }
            else if(prev.val > curr.val){
                if(insertVal >= prev.val){
                    ListNode node = new ListNode(insertVal);
                    prev.next = node;
                    node.next = curr;
                    return head;
                }
                if(insertVal <= curr.val){
                    ListNode node = new ListNode(insertVal);
                    prev.next = node;
                    node.next = curr;
                    return head;
                }
            }

            prev = curr;
            curr = curr.next;
        }while(prev != head);

        ListNode node = new ListNode(insertVal);
        prev.next = node;
        node.next = node;
        return node;
    }
}
