/*
 * @lc app=leetcode id=976 lang=java
 *
 * [976] Largest Perimeter Triangle
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int max =0;
        int len = nums.length;
        for (int i=len-1; i>1; i--) {
            for (int j=i-1; j>0; j--) {
                if (nums[j]+nums[j-1]>nums[i] 
                        && max<nums[i]+nums[j]+nums[j-1]) {
                    max = nums[i] + nums[j] + nums[j-1];
                    //System.out.println(i+ " : " + j);
                }
            }
        }
        return max;
    }
}
// @lc code=end

