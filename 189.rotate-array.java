import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode id=189 lang=java
 *
 * [189] Rotate Array
 */

// @lc code=start
class Solution {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        if (length == 1 || k==0) return;
        int[] results = new int[length];
        int x = 0;
        if (k<=length) {
            x=length-k;
        } else {
            x=length-k%length;
        }
        int j = 0;
        if (k<length) k=length;
        for (int i=0; i<k; i++) {
            results[j] = nums[x];
            x++;
            j++;
            if (j==length) j=0;
            if (x==length) x=0;
        }
        for (int i=0; i<length; i++) {
            nums[i]=results[i];
        }
    }
}
// @lc code=end

