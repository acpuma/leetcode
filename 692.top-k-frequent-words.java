/*
 * @lc app=leetcode id=692 lang=java
 *
 * [692] Top K Frequent Words
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> freq=new HashMap<>();
        for(String word:words){
            freq.put(word,freq.getOrDefault(word,0)+1);
        }
        List<String> res = new ArrayList(freq.keySet());
        Collections.sort(res, (w1, w2) -> freq.get(w1).equals(freq.get(w2)) ?
                w1.compareTo(w2) : freq.get(w2) - freq.get(w1));
        return res.subList(0, k);
    }
}
// @lc code=end

