/*
 * @lc app=leetcode id=1779 lang=java
 *
 * [1779] Find Nearest Point That Has the Same X or Y Coordinate
 */

// @lc code=start

class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int min=Integer.MAX_VALUE;
        int index=-1;
        for (int i=0;i<points.length; i++) {
            if (points[i][0]==x || points[i][1]==y) {
                int des = Math.abs(x-points[i][0])+Math.abs(y-points[i][1]);
                if (des<min) {
                    min=des;
                    index=i;
                }
            }
        }
        return index;
    }
}
// @lc code=end

