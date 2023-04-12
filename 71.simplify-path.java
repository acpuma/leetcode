import java.util.Stack;

/*
 * @lc app=leetcode id=71 lang=java
 *
 * [71] Simplify Path
 */

// @lc code=start
class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] directories = path.split("/");
        for (String dir: directories) {
            if (dir.equals(".") || dir.isEmpty()) {
                continue;
            }
            if (dir.equals("..") && !stack.isEmpty()) {
                stack.pop();
            } else if (!dir.equals("..")){
                stack.push(dir);
            }
        }
        return "/" + String.join("/", stack);
    }
}
// @lc code=end

