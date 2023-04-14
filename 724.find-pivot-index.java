/*
 * @lc app=leetcode id=724 lang=java
 *
 * [724] Find Pivot Index
 */

// @lc code=start
class Solution {
    public int pivotIndex(int[] nums) {
        int length = nums.length;
        if (length==1) {
            return 0;
        }
        int[] totl= new int[nums.length];
        int[] totr=new int[nums.length];
        totl[0]=nums[0];
        totr[length-1]=nums[length-1];
        for (int i=1; i<nums.length; i++) {
            totl[i]=nums[i]+totl[i-1];
            totr[length-i-1]=nums[length-i-1]+totr[length-i];
        }

        if (totr[1]==0) {
            return 0;
        }
        for (int i=1; i<length-1; i++) {
            if (totl[i-1]==totr[i+1]) {
                return i;
            }
        }
        if (totl[length-2]==0) {
            return length-1;
        }
        return -1;  
    }
}
// @lc code=end

