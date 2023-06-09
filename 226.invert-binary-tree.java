/*
@lc app=leetcode id=226 lang=java
 *
[226] Invert Binary Tree
 */

// @lc code=start

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
 
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root==null) return null;
        if (root.left != null) {invertTree(root.left);}
        if (root.right != null) {invertTree(root.right);}
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left=right;
        root.right=left;
        return root;
    }
}
// @lc code=end

