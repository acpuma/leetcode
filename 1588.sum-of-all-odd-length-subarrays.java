/*
 * @lc app=leetcode id=1588 lang=java
 *
 * [1588] Sum of All Odd Length Subarrays
 */

// @lc code=start
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        for (int len=1; len<=arr.length; len++) {
            if (len%2==1) {
                for (int i=0; i<arr.length-len+1; i++) {
                    for (int j=i; j<i+len; j++) {
                        sum+=arr[j];
                    }
                }
            }
        }
        return sum;
    }
}
// @lc code=end

