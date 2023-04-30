/*
 * @lc app=leetcode id=54 lang=java
 *
 * [54] Spiral Matrix
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> nos = new ArrayList<>();
        int rowBegin = 0;
        int rowEnd=matrix.length-1;
        int colBegin = 0;
        int colEnd = matrix[0].length -1 ;
        while (rowBegin<=rowEnd && colBegin<=colEnd) {
            for (int j=colBegin; j<=colEnd; j++) {
                nos.add(matrix[rowBegin][j]);
            }
            rowBegin++;

            for (int i=rowBegin; i<=rowEnd; i++) {
                nos.add(matrix[i][colEnd]);
            }
            colEnd--;

            if (rowBegin<=rowEnd)
            for (int j=colEnd; j>=colBegin; j--) {
                nos.add(matrix[rowEnd][j]);
            }
            rowEnd--;

            if (colBegin<=colEnd)
            for (int i=rowEnd; i>=rowBegin; i--) {
                nos.add(matrix[i][colBegin]);
            }
            colBegin++;
        }
        
        return nos;
    }
}
// @lc code=end

