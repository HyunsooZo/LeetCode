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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> temp = new ArrayList<>();
        while(list1 != null){
            temp.add(list1.val);
            list1 = list1.next;
        }
        while(list2 != null){
            temp.add(list2.val);
            list2 = list2.next;
        }
        Collections.sort(temp);
        ListNode answer = new ListNode(0);
        ListNode sub = answer;
        for(int i = 0 ; i < temp.size() ; i++){
            int val = temp.get(i);
            sub.next = new ListNode(val);
            sub = sub.next;
        }
        return answer.next;
    }
}