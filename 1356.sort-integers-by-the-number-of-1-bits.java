/*
 * @lc app=leetcode id=1356 lang=java
 *
 * [1356] Sort Integers by The Number of 1 Bits
 */

// @lc code=start

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] sortByBits(int[] arr) {
        return Arrays.stream(arr).boxed().sorted(
            Comparator.comparingInt(Integer::bitCount).thenComparingInt(Integer::valueOf))
            .mapToInt(Integer::intValue)
            .toArray();
    }
}
// @lc code=end

