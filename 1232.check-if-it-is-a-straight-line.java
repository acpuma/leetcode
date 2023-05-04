/*
 * @lc app=leetcode id=1232 lang=java
 *
 * [1232] Check If It Is a Straight Line
 */

// @lc code=start

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x0 = coordinates[0][0];
        int y0 = coordinates[0][1];
        int difx = coordinates[1][0]-x0;
        int dify = coordinates[1][1]-y0;
        for (int i=2; i<coordinates.length; i++) {
            if ((coordinates[i][0]-x0)*dify != (coordinates[i][1]-y0)*difx) {
                return false;
            }
        }
        return true; 
    }
}
// @lc code=end

