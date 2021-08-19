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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> values = new ArrayList<>();
        for( ListNode list:lists){
            while(list!=null){
                values.add(list.val);
                list = list.next;
            }
        }
        Collections.sort(values);
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        ListNode prev = null;
        for(int value:values){
            ListNode newNode = new ListNode(value);
            current.next = newNode;
            current = current.next;
        }
        return dummyHead.next;
    }
}