/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
 */

// @lc code=start
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
        ListNode prehead=new ListNode(-1);
        ListNode merged=prehead;
        while (list1!=null && list2!=null) {
            if (list1.val<list2.val) {
                merged.next = list1;
                list1=list1.next;
            } else {
                merged.next = list2;
                list2=list2.next;
            }
            merged=merged.next;
        }
        merged.next = list1 == null ? list2 : list1;
        return prehead.next;
    }
}
// @lc code=end

