import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> freq= new HashMap();
        for (int i=0; i<nums.length; i++) {
            Integer x = freq.get(nums[i]);
            if (x != null) {
                freq.put(nums[i], ++x);
            } else {
                freq.put(nums[i], 1);
            }
        }
        Integer key = Collections.max(freq.entrySet(), Map.Entry.comparingByValue()).getKey();
        //System.out.println(key);
        return key;
    }
}
// @lc code=end

