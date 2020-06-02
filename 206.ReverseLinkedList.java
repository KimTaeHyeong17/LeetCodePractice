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
import java.util.*;
class Solution {
    public ListNode reverseList(ListNode head) {
        ArrayList<ListNode> array = new ArrayList();
        if(head == null){
            return head;
        }
        while(true){
            if(head.next != null){
                array.add(head);
                head = head.next;
            }else{
                array.add(head);
                head = head.next;
                break;
            }
        }
        ListNode answer = new ListNode();
        ListNode lastNode = answer;
        
        for(int i = array.size()-1 ; i > -1 ; i--){
            // System.out.println(array.get(i).val);
            
            ListNode item = new ListNode(array.get(i).val);
            lastNode.next = item;
            lastNode = item;
            
        }
        
        
        return answer.next;
    }
}
