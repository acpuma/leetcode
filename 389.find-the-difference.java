/*
 * @lc app=leetcode id=389 lang=java
 *
 * [389] Find the Difference
 */

// @lc code=start
class Solution {
    public char findTheDifference(String s, String t) {
        for (int i=0; i<t.length(); i++) {
            if (s.contains(String.valueOf(t.charAt(i)))) {
                s=s.replaceFirst(String.valueOf(t.charAt(i)), "");;
            } else {
                return t.charAt(i);
            }
        }
        return 0;
    }
}
// @lc code=end

