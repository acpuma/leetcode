/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input Array Is Sorted
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        int last = numbers[0];
        for (int i=0; i<len; i++) {
            if (numbers[i]+numbers[i+1]==target) return new int[] {i+1,i+2};
            if (last!=numbers[i+1]) {
                for (int j=i; j<len; j++) {
                    if (numbers[i]+numbers[j]==target && i!=j) {
                        return new int[] {i+1,j+1};
                    }
                }
                last=numbers[i];
            }
        }
        return new int[] {0,0};
    }
}
// @lc code=end

