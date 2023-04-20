/*
 * @lc app=leetcode id=344 lang=java
 *
 * [344] Reverse String
 */

// @lc code=start
class Solution {
    public void reverseString(char[] s) {
        int length=s.length;
        for (int i=0; i<length/2; i++) {
            char temp=s[i];
            s[i]=s[length-i-1];
            s[length-i-1]=temp;
        }
        System.out.println(s);
    }
}
// @lc code=end

