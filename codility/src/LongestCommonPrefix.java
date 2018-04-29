/**
 * https://leetcode.com/problems/longest-common-prefix/description/
 */
public class LongestCommonPrefix {
    //
    public static void main(String[] args) {
        //
        String[] str = {"flower", "flow", "flight"};
        String result = longestCommonPrefix(str);
        System.out.println(result);
    }

    public static String longestCommonPrefix(String[] strs) {
        //
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
