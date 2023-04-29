/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next == null) return false;
        
        ListNode root = head;
        ListNode next = head.next;
        while(root!=next){
            if(next == null ||next.next==null){
                return false;
            }
            root = root.next;
            next = next.next.next;
        }
        return true;
    }
}