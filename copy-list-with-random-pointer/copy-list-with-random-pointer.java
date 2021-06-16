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
        HashMap<Node,Node> map = new HashMap<Node,Node>();
        
        Node current_node = head;
        Node new_head = null;
        Node prev = null;
        while(current_node!=null){
            Node new_node = new Node(current_node.val);
            new_node.random = current_node.random;
            if(prev==null){
                new_head = new_node;
            }
            else{
                prev.next = new_node;
            }
            map.put(current_node,new_node);
            current_node = current_node.next;
            prev = new_node;
        }
        
        Node temp = new_head;
        while(temp!=null){
            temp.random = map.get(temp.random);   
            temp = temp.next;
        }
        return new_head;
    }
}