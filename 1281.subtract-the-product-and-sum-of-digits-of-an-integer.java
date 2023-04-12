import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/*
 * @lc app=leetcode id=1281 lang=java
 *
 * [1281] Subtract the Product and Sum of Digits of an Integer
 */

// @lc code=start
class Solution {
    public int subtractProductAndSum(int n) {
        List<Integer> digits = new ArrayList<>();
        while (n>0) {
            digits.add(n%10);
            n=n/10;
        }
        int product =1;
        int sum = 0;
        for (Integer digit:digits) {
            product *=digit;
            sum +=digit;
        }
        return product-sum;
    }
}
// @lc code=end

