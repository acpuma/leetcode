/*
 * @lc app=leetcode id=844 lang=java
 *
 * [844] Backspace String Compare
 */

// @lc code=start
class Solution {
    public boolean backspaceCompare(String s, String t) {
        s=backspace(s);
        t=backspace(t);
        return s.equals(t);
    }

    String backspace(String s) {
        int i=0;
        while (i<s.length()) {
            if (s.charAt(i)=='#') {
                if (i>0) {
                    s= s.substring(0, i-1)+s.substring(i+1);
                    i--;
                } else {
                    s= s.substring(1);
                }
            } else {
                i++;
            }
        }
        return s;
    }
}
// @lc code=end

