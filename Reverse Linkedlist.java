/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next)
             { 
                this.val = val; 
                this.next = next;
             }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {

        if(head == null) return null;
        if(head.next == null) return head;

        var first = head;
        var second = first.next;

        first.next = null;

        while(second!=null){
            var third = second.next;
            second.next = first;
            first = second;
            second = third;
        }

        return first;
     
    }
}
