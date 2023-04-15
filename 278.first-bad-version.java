/*
 * @lc app=leetcode id=278 lang=java
 *
 * [278] First Bad Version
 */

// @lc code=start
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low=0;
        int high=n;
        while (low<=high) {
            int mid = low+(high-low)/2;
            boolean isBad = isBadVersion(mid);
            if (isBad && !isBadVersion(mid-1) ) {
                return mid;
            } else if (!isBad){
                low=mid+1;
            } else {
                high=mid;
            }
        }
        return low;
    }
}
// @lc code=end

