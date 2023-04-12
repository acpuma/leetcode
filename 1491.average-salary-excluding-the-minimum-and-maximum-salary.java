import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/*
 * @lc app=leetcode id=1491 lang=java
 *
 * [1491] Average Salary Excluding the Minimum and Maximum Salary
 */

// @lc code=start
class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int sum = IntStream.of(salary).sum() - salary[0]-salary[salary.length-1];
        return (double)sum/(salary.length-2);
    }
}
// @lc code=end

