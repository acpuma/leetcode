/*
 * @lc app=leetcode id=1290 lang=java
 *
 * [1290] Convert Binary Number in a Linked List to Integer
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
    public int getDecimalValue(ListNode head) {
        List<Integer> nums = new ArrayList<>();
        while (head!=null) {
            nums.add(head.val);
            head = head.next;
        }
        int sum = 0;
        int x=1;
        Collections.reverse(nums);
        for (int num:nums) {
            sum += num * x ;
            x = x * 2;
        }
        return sum;
    }
}
// @lc code=end

