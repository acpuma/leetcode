/*
 * @lc app=leetcode id=1572 lang=java
 *
 * [1572] Matrix Diagonal Sum
 */

// @lc code=start
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int len=mat.length;
        if (mat.length==1) {
            return mat[0][0];
        }
        for (int i=0; i<mat.length; i++) {
            sum+=mat[i][i];
            sum+=mat[mat.length-i-1][i];
        }
        if (len % 2 != 0) {
            sum=sum - mat[len/2][len/2];
        }
        return sum;
    }
}
// @lc code=end

