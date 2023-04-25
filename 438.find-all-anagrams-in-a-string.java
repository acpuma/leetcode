import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * @lc app=leetcode id=438 lang=java
 *
 * [438] Find All Anagrams in a String
 */

// @lc code=start
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if (p.length()>s.length()) return Collections.emptyList();
        List<Integer> answers = new ArrayList<>();
        int[] arrP = new int[26];
        int[] arrS = new int[26];
        for (int i=0; i<p.length(); i++) {
            arrP[p.charAt(i)-'a']++;
            arrS[s.charAt(i)-'a']++;
        }
        if (Arrays.equals(arrP, arrS)) {
            answers.add(0);
        }

        for (int start=0, end=p.length(); end<s.length(); end++,start++) {
            arrS[s.charAt(start)-'a']--;
            arrS[s.charAt(end)-'a']++;
            if (Arrays.equals(arrP, arrS)) {
                answers.add(start+1);
            }
        }
        return answers;
    }
}
// @lc code=end

