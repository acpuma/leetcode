/*
 * @lc app=leetcode id=496 lang=java
 *
 * [496] Next Greater Element I
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer> n2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        int[] res = new int[nums1.length];
        for (int i=0; i<nums1.length; i++) {
            int num=nums1[i];
            int x = n2.indexOf(num);
            if (x==nums2.length-1) res[i]=-1;
            if (x>=0) {
                for (int j=x+1; j<nums2.length; j++) {  
                    if (nums2[j]>num) {
                        res[i]=nums2[j];
                        break;
                    }
                }
            }
            if (res[i]==0) {
                res[i]=-1;
            }
        }   
        return res;     
    }
}
// @lc code=end

