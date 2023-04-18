import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=205 lang=java
 *
 * [205] Isomorphic Strings
 */

// @lc code=start
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length()!=t.length()) return false;
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        Map<Character,Character> subs = new HashMap<>();
        for (int i=0; i<ss.length; i++) {
            if (subs.get(ss[i])==null) {
                if (subs.values().contains(tt[i])) {
                    return false;
                }
                subs.put(ss[i], tt[i]);
            } else if (subs.get(ss[i])!=tt[i]) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

