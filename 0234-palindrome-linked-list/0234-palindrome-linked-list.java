class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        ListNode fst = head , sec = head;

        while (sec != null && sec.next != null) {
            fst = fst.next;
            sec = sec.next.next;
        }

        ListNode second = reverse(fst) , first = head;

        while (second != null) {
            if (first.val != second.val) return false;
            first = first.next;
            second = second.next;
        }
        return true;
    }
    
    public ListNode reverse(ListNode head) {
        ListNode prev = null , cur = head;

        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }
}
