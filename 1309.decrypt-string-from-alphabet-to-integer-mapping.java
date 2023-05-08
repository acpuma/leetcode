/*
 * @lc app=leetcode id=1309 lang=java
 *
 * [1309] Decrypt String from Alphabet to Integer Mapping
 */

// @lc code=start
class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        char[] chars=s.toCharArray();
        for (int i=s.length()-1; i>=0; i--) {
            int n=0;
            if (chars[i]=='#') {
                n = Integer.parseInt(chars[i-2]+""+chars[i-1]);
                i-=2;
            } else {
                n = Integer.parseInt(chars[i]+"");
            }
            char c =(char)(n+'a'-1);
            //System.out.println(c);
            sb.append(c);
        }
        return sb.reverse().toString();
    }
}
// @lc code=end

