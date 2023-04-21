/*
 * @lc app=leetcode id=617 lang=java
 *
 * [617] Merge Two Binary Trees
 */

// @lc code=start

// class TreeNode {
//      int val;
//      TreeNode left;
//      TreeNode right;
//      TreeNode() {}
//      TreeNode(int val) { this.val = val; }
//      TreeNode(int val, TreeNode left, TreeNode right) {
//          this.val = val;
//          this.left = left;
//          this.right = right;
//      }
//  }
 
public class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1==null && root2==null) return null;
        if (root1==null) return root2;
        if (root2==null) return root1;
        TreeNode t=new TreeNode(root1.val+root2.val);
        t.left=mergeTrees(root1.left, root2.left);
        t.right=mergeTrees(root1.right, root2.right); 
        return t;
    }
}
// @lc code=end

