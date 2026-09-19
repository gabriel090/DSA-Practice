// LeetCode 424: Longest Repeating Character Replacement
//
// We will READ the question first. Do not write the answer yet.

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        lookAt("ABAB", 2);
        printAllSubstrings("ABAB");
        // tryEachOneChange("AABABBA");  // we will come back to this later
    }

    private static void lookAt(String s, int k) {
        System.out.println("s = \"" + s + "\", k = " + k);
        System.out.print("index:");
        for (int i = 0; i < s.length(); i++) {
            System.out.print(" " + i);
        }
        System.out.println();
        System.out.print("char: ");
        for (int i = 0; i < s.length(); i++) {
            System.out.print(" " + s.charAt(i));
        }
        System.out.println();
        System.out.println("---");
    }

    // STEP: every contiguous piece. No changes. No answer.
    // left  = where the piece starts
    // right = where the piece ends (included)
    // substring(left, right + 1) because the end index is exclusive
    private static void printAllSubstrings(String s) {
        for (int left = 0; left < s.length(); left++) {
            for (int right = left; right < s.length(); right++) {
                String piece = s.substring(left, right + 1);
                System.out.println("left=" + left + " right=" + right
                        + " -> \"" + piece + "\"  length=" + piece.length());
            }
        }
    }

    // STEP: k = 1 on this example only (the string has only A and B).
    // For each index, change that one letter to the other letter.
    // Then walk left-to-right and measure the longest run of the SAME char.
    // This is practice with charAt / substring. It is NOT the final LeetCode solution.
    private static void tryEachOneChange(String s) {
        System.out.println("no change, longest run = " + longestRun(s));

        for (int i = 0; i < s.length(); i++) {
            char from = s.charAt(i);
            char to = (from == 'A') ? 'B' : 'A';
            String changed = s.substring(0, i) + to + s.substring(i + 1);
            System.out.println("change index " + i + " " + from + " -> " + to
                    + "  =>  " + changed
                    + "  longest run = " + longestRun(changed));
        }
    }

    // Count how many equal letters sit in a row. Reset when the letter changes.
    private static int longestRun(String s) {
        int best = 1;
        int current = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                current++;
                if (current > best) {
                    best = current;
                }
            } else {
                current = 1;
            }
        }
        return best;
    }
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            // Skip non-alphanumeric characters
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // empty on purpose — we fill this after we understand the question
    public static int characterReplacement(String s, int k) {
        return 0;
    }
}
