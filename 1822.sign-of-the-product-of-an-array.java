/*
 * @lc app=leetcode id=1822 lang=java
 *
 * [1822] Sign of the Product of an Array
 */

// @lc code=start
class Solution {
    public int arraySign(int[] nums) {
        int negatives = 0;
        boolean zero=false;
        for (int num:nums) {
            if (num==0) zero=true;
            if (num<0) negatives++;
        }
        if (zero) return 0;
        if (negatives%2==1) return -1;
        return 1;
    }
}
// @lc code=end

