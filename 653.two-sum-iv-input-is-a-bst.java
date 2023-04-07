import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=653 lang=java
 *
 * [653] Two Sum IV - Input is a BST
 */

// @lc code=start
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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> values = new ArrayList<>();
        findValues(root, values);
        for (int i=0; i<values.size(); i++) {
            for (int j=i+1; j<values.size(); j++) {
                if (values.get(i)+values.get(j)==k) return true;
            }
        }
        return false;
    }

    private void findValues(TreeNode root, List<Integer> values) {
        if (root==null) return;
        if (root.left!=null) findValues(root.left, values); 
        values.add(root.val);
        if (root.right!=null) findValues(root.right, values); 
    }
}
// @lc code=end

