/*
 * @lc app=leetcode id=389 lang=java
 *
 * [389] Find the Difference
 */

// @lc code=start
class Solution {
    public char findTheDifference(String s, String t) {
        return (char)(s+t).chars().reduce(0, (c,d)-> c^d);
    }
}
// @lc code=end

