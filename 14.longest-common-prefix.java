/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder(); 
        List<String> strlist=new ArrayList<>(Arrays.asList(strs));
        char[] firstStr = strs[0].toCharArray();
        for (int j=0; j<firstStr.length; j++) {
            boolean same=true;
            for (int i=0; i<strlist.size(); i++) {
                String str = strlist.get(i);
                if (str.length()<=j || str.charAt(j)!=firstStr[j]) {
                    same=false;
                    break;
                }
            }
            if (same) {
                sb.append(firstStr[j]);
            } else {
                break;
            }
        }
        return sb.toString();
    }
}
// @lc code=end

