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
  
        var result = new ListNode(0);
        var currentResultNode = result;

        var firstNumberCurrentNode = l1;
        var secondNumberCurrentNode = l2;

        int carryValue = 0;

        while (isNotNull(firstNumberCurrentNode) || isNotNull(secondNumberCurrentNode)) {

            int firstDigitValue = 0;
            if (isNotNull(firstNumberCurrentNode)) {
                firstDigitValue = firstNumberCurrentNode.val;
            }

            int secondDigitValue = 0;
            if (isNotNull(secondNumberCurrentNode)) {
                secondDigitValue = secondNumberCurrentNode.val;
            }

            int sumValue = firstDigitValue + secondDigitValue + carryValue;

            int resultDigitValue = sumValue % 10;
            carryValue = sumValue / 10;

            currentResultNode.next = new ListNode(resultDigitValue);
            currentResultNode = currentResultNode.next;

            if (isNotNull(firstNumberCurrentNode)) {
                firstNumberCurrentNode = firstNumberCurrentNode.next;
            }
            if (isNotNull(secondNumberCurrentNode)) {
                secondNumberCurrentNode = secondNumberCurrentNode.next;
            }
        }

        if (carryValue > 0) {
            currentResultNode.next = new ListNode(carryValue);
        }

        return result.next;

    }

    static boolean isNotNull(ListNode object){
        return object != null;
    }
}