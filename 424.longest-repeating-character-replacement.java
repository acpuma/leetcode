/*
 * @lc app=leetcode id=424 lang=java
 *
 * [424] Longest Repeating Character Replacement
 */

// @lc code=start
class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int most=0;
        int left = 0;
        int max = 0;
        for (int right=0; right<s.length(); right++) {
            freq[s.charAt(right)-'A']++;
            most = Math.max(most, freq[s.charAt(right)-'A']);
            int lettersToChange = (right-left+1)-most;
            if (lettersToChange>k) {
                freq[s.charAt(left)-'A']--;
                left++;
            }
            max = Math.max(max, right-left+1);
        }
        return max;
    }
}
// @lc code=end

