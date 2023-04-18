import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=409 lang=java
 *
 * [409] Longest Palindrome
 */

// @lc code=start
class Solution {
    public int longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c:chars) {
            if (map.get(c)==null) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c)+1);
            }
        }
        int dubs =0;
        int single = 0;
        for (Character c:map.keySet()) {
            int val=map.get(c);
            if (map.get(c)>1) {
                dubs=dubs+val/2;
            }
            if (val%2==1) single=1;
        }
        return dubs*2+single;
    }
}
// @lc code=end

