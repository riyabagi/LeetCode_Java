/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {

        ListNode dummy = new ListNode(0);
        ListNode h1 = new ListNode(0); 
        ListNode h2 = new ListNode(0); 

        ListNode p1 = h1;
        ListNode p2 = h2; 

        while (head != null) {

            if (head.val < x) {
                p1.next = head;
                p1 = p1.next;
            }

            else {
                p2.next = head;
                p2 = p2.next;
            }

            head = head.next;
        }

        p2.next = null;
        p1.next = h2.next;
        return h1.next;
    }
}