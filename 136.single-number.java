import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode id=136 lang=java
 *
 * [136] Single Number
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        int xor=0;
        for (int i=0; i<nums.length; i++) {
            xor^=nums[i];
            System.out.println(xor);
        }
        return xor;
    }
}
// @lc code=end

