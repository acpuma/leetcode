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
        if (n==1) return 1;
        if (n==2) return 2;
        int n1=1;
        int n2=2;
        int n3= n1+n2;
        for (int i=3; i<n; i++) {
            n1=n2;
            n2=n3;
            n3 = n1 + n2;
        }
        return n3;
    }
}
// @lc code=end

