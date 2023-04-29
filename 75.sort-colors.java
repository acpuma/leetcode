/*
 * @lc app=leetcode id=75 lang=java
 *
 * [75] Sort Colors
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        for (int i=0; i<nums.length-1; i++) {
            for (int j=i+1; j<nums.length; j++)
            if (nums[j]<nums[i]) {
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
    }
}
// @lc code=end

