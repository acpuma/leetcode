/*
 * @lc app=leetcode id=394 lang=java
 *
 * [394] Decode String
 */

// @lc code=start

import java.util.Stack;

class Solution {
    public String decodeString(String s) {
        while (s.lastIndexOf('[')>0) {
            int open = s.lastIndexOf('[');
            int close = s.indexOf(']', open);
            int k=1;
            while (open-k>=0 && Character.isDigit(s.charAt(open-k))) {
                k++;
            }
            Integer count = Integer.parseInt(s.substring(open-k+1, open));
            String sub = s.substring(open+1, close);
            StringBuilder decoded = new StringBuilder(); 
            for (int i=0; i<count; i++) {
                decoded.append(sub);
            }
            s = s.substring(0, open-k+1) + decoded.toString() + s.substring(close+1);
        }
        return s;
    }


}
// @lc code=end

