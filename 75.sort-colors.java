/*
 * @lc app=leetcode id=75 lang=java
 *
 * [75] Sort Colors
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int l=0;
        int r=nums.length-1;
        while (i<=r) {
            if (nums[i]==0) {
                swap(nums, i++, l++);
            } else if (nums[i]==2) {
                swap(nums, i, r--);
            } else {
                i++;
            }
        }
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
// @lc code=end

