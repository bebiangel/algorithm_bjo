/**
 * https://leetcode.com/problems/longest-valid-parentheses/description/
 */
public class LongestValidParentheses {
    //
    public static void main(String[] args) {
        //
        String s = "((())()";
        int result = longestValidParentheses(s);
    }

    public static int longestValidParentheses(String s) {
        //
        String[] strs = s.split("");
        if (strs.length < 2) return 0;
        for (int i = 0; i < strs.length; i++) {
            String curr = strs[i];
            String next = strs[i + 1];
        }

        return 0;
    }
}
