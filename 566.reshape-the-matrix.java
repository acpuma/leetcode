/*
 * @lc app=leetcode id=566 lang=java
 *
 * [566] Reshape the Matrix
 */

// @lc code=start
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] result=new int[r][c];
        if (mat.length*mat[0].length!= r*c) {
            return mat;
        }
        int count=0;
        int count2=0;
        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[0].length; j++) {
                if (count >= c) {
                    count=0;
                    count2++;
                }
                //System.out.println(i+" " + j + " " + count + " " + count2);
                result[count2][count]=mat[i][j];
                count++;
            }
        }
        return result;
    }
}
// @lc code=end

