/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }
        
        HashMap<Node,Node> map = new HashMap();
        
        Node last = head;
        while(last != null){
            map.put(last, new Node(last.val));
            last = last.next;
        }
        
        last = head;
        while(last != null){
            map.get(last).next = map.get(last.next);
            map.get(last).random = map.get(last.random);
            last = last.next;
        }
        return map.get(head);
    }
}
