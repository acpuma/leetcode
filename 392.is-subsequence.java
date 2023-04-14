/*
 * @lc app=leetcode id=392 lang=java
 *
 * [392] Is Subsequence
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length()==0) {
            return true;
        }
        int j= 0;
        char[] ss= s.toCharArray();
        char[] tt= t.toCharArray();
        for (int i=0; i<t.length(); i++) {
            if (j<s.length() && ss[j]==tt[i]) {
                j++;
            } 
        }
        if (j==ss.length) {
            return true;
        }
        return false;
    }
}
// @lc code=end

