/*
 * @lc app=leetcode id=977 lang=java
 *
 * [977] Squares of a Sorted Array
 */

// @lc code=start
class Solution {
    public int[] sortedSquares(int[] nums) {
        return Arrays.stream(nums).map(x->x*x).sorted().toArray();
    }
}
// @lc code=end

