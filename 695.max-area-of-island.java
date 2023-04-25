/*
 * @lc app=leetcode id=695 lang=java
 *
 * [695] Max Area of Island
 */

// @lc code=start
class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[0].length; j++) {
                int area = findArea(grid, i, j);
                if (area>max) max=area;
            }
        }
        return max;
    }
    private int findArea(int[][] grid, int i, int j) {
        int area = 1;
        if (i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==0) return 0;
        grid[i][j]=0;
        area+=findArea(grid, i-1, j);
        area+=findArea(grid, i+1, j);
        area+=findArea(grid, i, j-1);
        area+=findArea(grid, i, j+1);
        return area;
    }
}
// @lc code=end

