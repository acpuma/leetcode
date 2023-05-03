/*
 * @lc app=leetcode id=1502 lang=java
 *
 * [1502] Can Make Arithmetic Progression From Sequence
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int dif = Math.abs(arr[0]-arr[1]);
        for (int i=2; i<arr.length; i++) {
            if (Math.abs(arr[i-1]-arr[i])!=dif) return false;
        }
        return true;
    }
}
// @lc code=end

