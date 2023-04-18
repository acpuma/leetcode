import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode id=142 lang=java
 *
 * [142] Linked List Cycle II
 */

// @lc code=start

// Definition for singly-linked list.
 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head==null) return null;
        Set<ListNode> nodes = new HashSet<>();
        int i=0;
        ListNode temp = head;
        boolean found = false;
        while (temp.next!=null) {
            i++;
            System.out.println(temp.val);
            if (!nodes.add(temp)) {
                // System.out.println("tail connects to node index " + i);
                found =true;
                break;
            }
            temp = temp.next;
        }
        if (!found) {
            // System.out.println("no cycle");
            return null;
        }
        return temp;
    }
}
// @lc code=end

