/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class IntersectionTwoLinkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA, b = headB;

        while (a != b) {
            if (a == null) {
                a = headB;
                b = b.next;
            } else if (b == null) {
                b = headA;
                a = a.next;
            } else {
                a = a.next;
                b = b.next;
            }
        }

        return a;
    }
}