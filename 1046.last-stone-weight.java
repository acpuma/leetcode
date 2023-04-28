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
        int n = stones.length;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone:stones) {
            maxHeap.offer(stone);
        }
        while (maxHeap.size()!=1) {
            int s1= maxHeap.poll();
            int s2= maxHeap.poll();
            maxHeap.offer(Math.abs(s1-s2));
        }
        return maxHeap.poll();
    }
}
// @lc code=end

