package Linkedlist;

//import org.w3c.dom.Node;

public class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  public ListNode child;
  public ListNode prev;
}