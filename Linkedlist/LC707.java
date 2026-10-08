//707. Design Linked List
/*Design your implementation of the linked list. You can choose to use a singly or doubly linked list.
A node in a singly linked list should have two attributes: val and next. val is the value of the current node, 
and next is a pointer/reference to the next node.
If you want to use the doubly linked list, you will need one more attribute prev to indicate the previous node in the linked list. 
Assume all nodes in the linked list are 0-indexed. */

package Linkedlist;

public class LC707 {
    ListNode head;
    int size; 

    public void MyLinkedList() {
        head = new ListNode(0);
        size = 0;
    }
    
    public int get(int index) {
        if(index < 0){
            return -1;
        }
        if(index >= size){
            return -1;
        }
        ListNode curr = head;
        for(int i=0; i<=index; i++){
            curr = curr.next;
        }
        return curr.val;
    }
    
    public void addAtHead(int val) {
        addAtIndex(0,val);
    }
    
    public void addAtTail(int val) {
        addAtIndex(size,val);
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0){
            return;
        }
        if(index > size){
            return;
        }
        ListNode curr = head;
        size++;
        for(int i=0; i<index; i++){
            curr = curr.next;
        }
        ListNode newNode = new ListNode(val);
        newNode.next = curr.next;
        curr.next = newNode;
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0){
            return;
        }
        if(index >= size){
            return;
        }

        ListNode curr = head;
        for(int i=0; i<index; i++){
            curr = curr.next;
        }
        
        size--;
        curr.next = curr.next.next;
    }
}