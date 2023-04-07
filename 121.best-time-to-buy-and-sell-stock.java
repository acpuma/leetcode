/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int max=0;
        for (int i=0; i<prices.length; i++) {
            if (prices[i]<buy) {
                buy=prices[i];
            } else if (prices[i]-buy>max){
                max= prices[i]-buy;
            }
        }
        return max;
    }
}
// @lc code=end

