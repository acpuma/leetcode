/*
 * @lc app=leetcode id=1790 lang=java
 *
 * [1790] Check if One String Swap Can Make Strings Equal
 */

// @lc code=start
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int count=0;
        int x1=-1;
        int x2=-1;
        for (int i=0; i<s1.length(); i++) {
            if (s1.charAt(i)!=s2.charAt(i)) {
                count++;    
                if (x1<0) {
                    x1=i;
                } else {
                    x2=i;
                }
            }
        }
        if (count==0) return true;
        if (count==2) {
            if (s1.charAt(x1)==s2.charAt(x2)
                    && s1.charAt(x2)==s2.charAt(x1)) {
                return true;
            }
        }
        return false;
    }
}
// @lc code=end

