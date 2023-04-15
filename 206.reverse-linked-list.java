/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
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
    public ListNode reverseList(ListNode head) {
        if (head==null) {
            return null;
        }
        List<ListNode> nodes=new ArrayList();
        do {
            nodes.add(head);
            head=head.next;
        } while (head!=null);
        
        ListNode reversed = null;
        nodes.get(0).next=null;
        for (int i=nodes.size()-1; i>0; i--) {
            nodes.get(i).next=nodes.get(i-1);
        }
        return nodes.get(nodes.size()-1);
    }
}
// @lc code=end

