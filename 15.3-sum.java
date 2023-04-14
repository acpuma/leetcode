import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> solutions = new HashSet<>();
        int length=nums.length;
        for (int i=0; i<length-2; i++) {
            int j=i+1;
            int k=length-1;
            while (j<k) {
                int sum=nums[i]+nums[j]+nums[k];
                if (i!=j && i!=k && j!=k) {                    
                    List<Integer> solution = new ArrayList<>();
                    if (sum==0) {
                        solution.add(nums[i]);
                        solution.add(nums[j]);
                        solution.add(nums[k]);
                    } 
                    Collections.sort(solution);
                    if (!solution.isEmpty()) {
                        solutions.add(solution);
                        j++;
                        k--;
                    }
                }
                if (sum>0) k--;
                if (sum<0) j++;
            }
        }
        return new ArrayList<>(solutions);
    }
}
// @lc code=end

