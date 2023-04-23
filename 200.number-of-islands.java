/*
 * @lc app=leetcode id=200 lang=java
 *
 * [200] Number of Islands
 */

// @lc code=start
class Solution {
    
    public int numIslands(char[][] grid) {
        int islands = 0;
        if (grid.length==0) return 0;
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[0].length; j++) {
                if (grid[i][j]=='1') {
                    findIsland(grid, i, j);
                    islands++;
                }
            }
        }
        return islands;
    }

    void findIsland(char[][] grid, int i, int j) {
        if (i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]!='1') return;
        grid[i][j]='0';
        findIsland(grid, i-1, j);
        findIsland(grid, i+1, j);
        findIsland(grid, i, j-1);
        findIsland(grid, i, j+1);
    }
}
// @lc code=end

