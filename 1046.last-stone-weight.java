/*
 * @lc app=leetcode id=1046 lang=java
 *
 * [1046] Last Stone Weight
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

class Solution {
    public int lastStoneWeight(int[] stones) {
        int x=0;
        int y=0;
        List<Integer> nos = new ArrayList<>();
        for (int stone:stones) nos.add(stone);
        Collections.sort(nos);
        while (nos.size()>1) {
            int count = nos.size();
            if (nos.get(count-2)==nos.get(count-1)) {
                nos.remove(count-1);
                nos.remove(count-2);
            } else {
                int s1 = nos.get(count-1);
                int s2 = nos.get(count-2);
                nos.set(count-2,s1-s2);
                nos.remove(count-1);
                Collections.sort(nos);
            }
        }
        if (nos.isEmpty()) return 0;
        x=nos.get(0);
        return x;
    }
}
// @lc code=end

