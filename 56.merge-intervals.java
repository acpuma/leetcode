/*
 * @lc app=leetcode id=56 lang=java
 *
 * [56] Merge Intervals
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length<=1) return intervals;
        Arrays.sort(intervals, (i1,i2) -> Integer.compare(i1[0], i2[0]));

        List<int[]> result = new ArrayList<>();
        int[] newitem = intervals[0];
        result.add(newitem);
        for (int[] item:intervals) {
            if (item[0]<=newitem[1]) {
                newitem[1] = Math.max(newitem[1], item[1]);
            } else {
                newitem = item;
                result.add(newitem);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
// @lc code=end

