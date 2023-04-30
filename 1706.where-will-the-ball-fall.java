/*
 * @lc app=leetcode id=1706 lang=java
 *
 * [1706] Where Will the Ball Fall
 */

// @lc code=start
class Solution {
    public int[] findBall(int[][] grid) {
        int leni=grid.length;
        int lenj=grid[0].length;
        int[] results = new int[lenj];
        for (int j=0; j<lenj; j++) {
            int curj=j;
            for (int i=0; i<leni; i++) {
                System.out.println(i+":"+curj);
                if ((grid[i][curj]==1 && curj==lenj-1)
                    || (grid[i][curj]==-1 && curj==0)
                    || (grid[i][curj]==1 && grid[i][curj+1]==-1)
                    || (grid[i][curj]==-1 && grid[i][curj-1]==1)) {
                    results[j]=-1;
                    break;
                } else if (curj>=0 && curj+1<lenj && grid[i][curj]==1 && grid[i][curj+1]==1) {
                    curj++;
                } else if (curj>=0 && curj<lenj && grid[i][curj]==-1 && grid[i][curj-1]==-1) {
                    curj--;
                }
            }
            if (results[j]!=-1) results[j]=curj;
            System.out.println(results[j]);
        }
        return results;
    }
}
// @lc code=end

