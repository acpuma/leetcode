/*
 * @lc app=leetcode id=112 lang=java
 *
 * [112] Path Sum
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 */
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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return findSum(root, targetSum, 0);
    }

    private boolean findSum(TreeNode node, int targetSum, int currentSum) {
        if (node==null) return false;
        currentSum+=node.val;
        if (node.left==null && node.right==null) {
            if (currentSum==targetSum) return true;
        }
        return findSum(node.left, targetSum, currentSum) 
            || findSum(node.right, targetSum, currentSum);      
    }
}
// @lc code=end

