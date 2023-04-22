import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=589 lang=java
 *
 * [589] N-ary Tree Preorder Traversal
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<Integer> values = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if (root!=null) {
            values.add(root.val);
            for (Node node:root.children) {
                preorder(node);
            }
        }
        return values;

    }
}
// @lc code=end

