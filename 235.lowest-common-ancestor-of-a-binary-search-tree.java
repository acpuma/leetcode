import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * @lc app=leetcode id=235 lang=java
 *
 * [235] Lowest Common Ancestor of a Binary Search Tree
 */

// @lc code=start

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p == null || q ==null) return root;
        List<TreeNode> ancp=new ArrayList<>();
        searchNode(root, p, ancp);
        List<TreeNode> ancq=new ArrayList<>(); 
        searchNode(root, q, ancq);
        int i=0;
        while (ancp.get(i)!=null && ancq.get(i)!=null && ancp.get(i)==ancq.get(i)) {
            i++;
            if (i==ancp.size() || i==ancq.size()) break;
        }
        return ancq.get(i-1);
    }

    private void searchNode(TreeNode root, TreeNode node, List<TreeNode> list) {
        if (root==null || node==null) return;
        list.add(root);
        if (root.val > node.val) searchNode(root.left, node, list);
        if (root.val < node.val) searchNode(root.right, node, list);
        if (root.val==node.val) return;
    }
}
// @lc code=end

