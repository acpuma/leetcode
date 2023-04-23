/*
 * @lc app=leetcode id=733 lang=java
 *
 * [733] Flood Fill
 */

// @lc code=start
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) return image;
        fill(image, sr, sc, image[sr][sc],color);
        return image;
    }

    void fill(int[][] image, int sr, int sc, int color, int newcolor){
        if (sr<0 || sc<0 || sr>=image.length || sc>=image[0].length 
                || color!=image[sr][sc])  return;
        image[sr][sc]=newcolor;
        fill(image, sr-1, sc, color, newcolor);
        fill(image, sr+1, sc, color, newcolor);
        fill(image, sr, sc-1, color, newcolor);
        fill(image, sr, sc+1, color, newcolor);
    }
}
// @lc code=end

