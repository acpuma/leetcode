/*
 * @lc app=leetcode id=953 lang=java
 *
 * [953] Verifying an Alien Dictionary
 */

// @lc code=start
class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        for (int i=0; i<words.length-1; i++) {
            for (int j=0; j<words[i].length(); j++) {
                if (j<words[i+1].length() && j<words[i].length()) {
                    char c=words[i].charAt(j);
                    char nextc=words[i+1].charAt(j);
                    if (c!=nextc) {
                        if (order.indexOf(c)>order.indexOf(nextc)) {
                            return false;
                        } else {
                            break;
                        }
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
// @lc code=end

