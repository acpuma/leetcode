/*
 * @lc app=leetcode id=953 lang=java
 *
 * [953] Verifying an Alien Dictionary
 */

// @lc code=start
class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] orders = new int[26];
        for (int i=0; i<order.length(); i++) {
            orders[order.charAt(i)-'a'] = i;
        }
        for (int i=0; i<words.length-1; i++) {
            for (int j=0; j<words[i].length(); j++) {
                if (j>=words[i+1].length()) return false;
                int c=words[i].charAt(j)-'a';
                int nextc=words[i+1].charAt(j)-'a';
                if (c!=nextc) {
                    if (orders[c]>orders[nextc]) {
                        return false;
                    } else {
                        break;
                    }
                }
            
            }
        }
        return true;
    }
}
// @lc code=end

