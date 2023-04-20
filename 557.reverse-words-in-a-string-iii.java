/*
 * @lc app=leetcode id=557 lang=java
 *
 * [557] Reverse Words in a String III
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word:words) {
            String reversed = new String(reverse(word.toCharArray()));
            result.append(reversed+" ");
        }
        return result.toString().trim();
    }
    char[] reverse(char[] s) {
        int length=s.length;
        for (int i=0; i<length/2; i++) {
            char temp=s[i];
            s[i]=s[length-i-1];
            s[length-i-1]=temp;
        }
        return s;
    }
}
// @lc code=end

