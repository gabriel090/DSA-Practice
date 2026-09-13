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
        printResult(new String[] { "flower", "flow", "flight" });
        printResult(new String[] { "dog", "racecar", "car" });

        // Edge cases to think about — what SHOULD each one return?
        printResult(new String[] { "hello" });
        printResult(new String[] { "a", "a", "a" });
        printResult(new String[] { "", "empty", "example" });
        printResult(new String[] { "interview", "inter", "internal" });
        printResult(new String[] { "abc", "ab", "a" });
    }

    private static void printResult(String[] strs) {
        System.out.println(java.util.Arrays.toString(strs) + " -> \"" + longestCommonPrefix(strs) + "\"");
    }

    // PHASE 2: brute force lives here.
    // Right now it is a stub so you can run the file and see "" for every case.
    public static String longestCommonPrefix(String[] strs) {
        return "";
    }
}
