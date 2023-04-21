/*
 * @lc app=leetcode id=19 lang=java
 *
 * [19] Remove Nth Node From End of List
 */

// @lc code=start
// Definition for singly-linked list.


class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int size = 0;
        while(temp!=null) {
            size++;
            temp = temp.next;
        }
        ListNode prev = head;
        int i=size-n;
        if (i==0) {
            head=head.next;
        }
        while (i - 1 > 0 ) {
            prev = prev.next; 
            i--;
        }
        if (prev!=null && prev.next!=null)
        prev.next = prev.next.next;
        return head;
    }
}
// @lc code=end

