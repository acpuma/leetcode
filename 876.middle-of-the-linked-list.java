import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=876 lang=java
 *
 * [876] Middle of the Linked List
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
    public ListNode middleNode(ListNode head) {
        List<ListNode> nodes = new ArrayList<>();
        while (head!=null) {
            nodes.add(head);
            head=head.next;
        }
        int size = (int)Math.ceil(nodes.size()/2);
        System.out.println(size);
        return nodes.get(size);
    }
}
// @lc code=end

