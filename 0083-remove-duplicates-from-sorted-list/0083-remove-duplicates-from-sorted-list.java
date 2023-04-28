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
    public ListNode deleteDuplicates(ListNode head) {
        TreeSet<Integer> set = new TreeSet<>();
        while(head!=null){
            set.add(head.val);
            head = head.next;
        }
        ListNode answer = new ListNode(0);
        ListNode dummy = answer;
        for(int i: set){
            int val = i;
            dummy.next = new ListNode(i);
            dummy = dummy.next;
        }
        return answer.next;
    }
}