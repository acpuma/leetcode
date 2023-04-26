/*
 * @lc app=leetcode id=299 lang=java
 *
 * [299] Bulls and Cows
 */

// @lc code=start
class Solution {
    public String getHint(String secret, String guess) {
        int len = secret.length();
        int bullcount = 0;
        for (int i = 0; i < len; i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                secret = secret.substring(0, i) + "A" + secret.substring(i + 1);
                guess = guess.substring(0, i) + "A" + guess.substring(i + 1);
                bullcount++;
            }
        }
        int cows = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (secret.charAt(i) == guess.charAt(j)
                        && secret.charAt(i) != 'A'
                        && secret.charAt(i) != 'B') {
                    secret = secret.substring(0, i) + "B" + secret.substring(i + 1);
                    guess = guess.substring(0, j) + "B" + guess.substring(j + 1);
                    cows++;
                }
            }
        }
        return bullcount + "A" + cows + "B";
    }
}
// @lc code=end
