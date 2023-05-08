/*
 * @lc app=leetcode id=709 lang=java
 *
 * [709] To Lower Case
 */

// @lc code=start
class Solution {
    public String toLowerCase(String s) {
        char[] chars=s.toCharArray();
        for (int i=0; i<s.length(); i++) {
            if (Character.isUpperCase(chars[i])) {
                chars[i]=Character.toLowerCase(chars[i]);
            }
        }
        return new String(chars);
    }
}
// @lc code=end

