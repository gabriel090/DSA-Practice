// Pattern: Two pointers (strings)
//
// What: two indexes on the same string that move.
// Today we only WATCH them move. We do not answer a question yet.
//
// How you know a question wants this:
//   - compare the start with the end (palindrome)
//   - reverse, or "same forwards and backwards"
//   - pair letters from the outside in
//   - you do NOT need every substring, only two "fingers"
//
// Where to start:
//   left  = 0
//   right = s.length() - 1
//   while (left < right) { ... left++; right--; }

public class TwoPointers {
    public static void main(String[] args) {
        walkTwoPointers("hello");
    }

    public static void walkTwoPointers(String s) {
        //  s = "hello"
        //  index: 0 1 2 3 4
        //  char:  h e l l o
        //
        //  left starts on h, right starts on o
        //  they walk toward the middle
        //
        //  Time:  each step moves left or right, they meet in the middle  ->  O(n)
        //  Space: two ints only                                         ->  O(1)

        System.out.println("s = " + s);
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            System.out.println("left=" + left + " '" + s.charAt(left)
                    + "'   right=" + right + " '" + s.charAt(right) + "'");
            left++;
            right--;
        }
    }
}
