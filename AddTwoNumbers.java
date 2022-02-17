/*
        Definition for singly-linked list.*/
class ListNode {
    int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class AddTwoNumbers {
    public static void main(String[] args){
    int[] l1 = {2,4,3};
    int[] l2 = {5,6,4};
    ListNode l1ListNode = new ListNode();
    ListNode l2ListNode = new ListNode();

    for (int v: l1){
        l1ListNode = new ListNode(l1[v]);
    }

    }


}
