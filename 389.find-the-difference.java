/*
 * @lc app=leetcode id=389 lang=java
 *
 * [389] Find the Difference
 */

// @lc code=start
class Solution {
    public char findTheDifference(String s, String t) {
        char c=0;
        for (char cs:s.toCharArray()) c^=cs;
        for (char cs:t.toCharArray()) c^=cs;
        return c;
    }
}
// @lc code=end

