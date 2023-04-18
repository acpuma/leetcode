import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int length = nums.length;
        int i=0;
        for (int num:nums) {
            if (num!=0) {
                nums[i++]=num;
            }
        }
        while (i<nums.length) {
            nums[i++] = 0;
        }
    }
}
// @lc code=end

