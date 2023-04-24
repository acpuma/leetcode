import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

// @lc code=start
class Solution {
    
    public int climbStairs(int n) {   
        List<Integer> steps = new ArrayList<>();
        steps.add(0);
        steps.add(1);
        steps.add(2);
        for (int i=3; i<=n; i++) {
            steps.add(steps.get(i-1)+steps.get(i-2));
        }
        return steps.get(n);
    }
}
// @lc code=end

