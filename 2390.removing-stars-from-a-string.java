import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * @lc app=leetcode id=2390 lang=java
 *
 * [2390] Removing Stars From a String
 */

// @lc code=start
class Solution {
    public String removeStars(String s) {
        Stack<Character> chars = new Stack<>();
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i)=='*') {
                chars.pop();
            } else {
                chars.push(s.charAt(i));
            }
        }
        StringBuilder result = new StringBuilder();
        while(!chars.isEmpty()) {
            result.append(chars.pop());
        }
        result.reverse();
        return result.toString();
    }
}
// @lc code=end

