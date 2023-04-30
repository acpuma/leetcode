/*
 * @lc app=leetcode id=202 lang=java
 *
 * [202] Happy Number
 */

// @lc code=start

import java.util.HashSet;
import java.util.Set;

class Solution {
    Set<Integer> seen = new HashSet<>();
    public boolean isHappy(int n) {
        int sum=0;
        while (n>0) {
            int digit = n%10;
            sum += digit * digit;
            if (n-digit==0) break;
            n=n/10;
        }
        if (seen.contains(sum)) {
            return false;
        }
        seen.add(sum);
        if (sum==1) return true;
        return isHappy(sum);
    }
}
// @lc code=end

