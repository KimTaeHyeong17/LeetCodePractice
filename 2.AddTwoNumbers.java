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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;
        ListNode root = new ListNode(-1);
        ListNode curr = root;
        while(l1 != null || l2 != null || sum >= 10) {
            sum =  sum / 10;
            if(l1 != null) {
                sum = sum + l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                sum = sum + l2.val;
                l2 = l2.next;
            }
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }
        return root.next;    
    }
}
