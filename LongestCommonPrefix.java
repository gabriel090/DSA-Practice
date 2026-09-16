// LeetCode 14: Longest Common Prefix
//
// Goal: return the longest starting substring that EVERY string in the array shares.
// If nothing is shared at the start, return "".
//
// Examples:
//   ["flower","flow","flight"] -> "fl"
//   ["dog","racecar","car"]    -> ""
//
// Constraints (LeetCode):
//   1 <= strs.length <= 200
//   0 <= strs[i].length <= 200
//   non-empty strings are lowercase English letters
//
// We will write BRUTE FORCE first. Do not jump to an "optimal" version yet.

public class LongestCommonPrefix {
    public static void main(String[] args) {
        // Official examples
        printResult(new String[] { "fli","flower", "flow", "flight" });
        printResult(new String[] { "dog", "racecar", "car" });

        // Edge cases to think about — what SHOULD each one return?
        printResult(new String[] { "hello" });
        printResult(new String[] { "a", "a", "a" });
        printResult(new String[] { "", "empty", "example" });
        printResult(new String[] { "interview", "inter", "internal" });
        printResult(new String[] { "abc", "ab", "a" });
        printResult(new String[] { "car", "racecar" });
        printResult(new String[] { "ab", "ba" });
    }

    private static void printResult(String[] strs) {
        System.out.println(java.util.Arrays.toString(strs) + " -> \"" + longestCommonPrefix(strs) + "\"");
    }

    // PHASE 2: your current draft (empty inner loop — we will fill this next)
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prx = strs[0];

        // Treat the first string as the candidate prefix
        // for each later string: while that string does not start with the candidate, drop the last character
        //
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prx) != 0) {
               prx = prx.substring(0, prx.length() - 1);
            }
            if (prx.isEmpty()) return "";
        }
        return prx;
    }
}
