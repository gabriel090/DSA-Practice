// LeetCode 412: Fizz Buzz
//
// Goal: given n, return a list of n strings for the numbers 1, 2, ..., n.
// For each number i:
//   if i is divisible by 3 AND 5  -> "FizzBuzz"
//   else if i is divisible by 3   -> "Fizz"
//   else if i is divisible by 5   -> "Buzz"
//   else                          -> the number itself as a string  ("1", "2", ...)
//
// Examples:
//   n = 3  -> ["1","2","Fizz"]
//   n = 5  -> ["1","2","Fizz","4","Buzz"]
//   n = 15 -> [..., "FizzBuzz"]  (15 is divisible by both 3 and 5)
//
// Constraints (LeetCode):
//   1 <= n <= 10^4
//
// Trap: the problem says the answer is 1-indexed (answer for number i).
// Java lists are 0-indexed, so:
//   list.get(0) is the answer for 1
//   list.get(1) is the answer for 2
//   list.get(n-1) is the answer for n
//
// We will write BRUTE FORCE first. Do not jump to an "optimal" version yet.

public class FizzBuzz {
    public static void main(String[] args) {
        printResult(3);
        printResult(5);
        printResult(15);
    }

    private static void printResult(int n) {
        System.out.println("n = " + n + " -> " + fizzBuzz(n));
    }

    public static java.util.List<String> fizzBuzz(int n) {
        java.util.List<String> results = new java.util.ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results.add("FizzBuzz");
            } else if (i % 3 == 0) {
                results.add("Fizz");
            } else if (i % 5 == 0) {
                results.add("Buzz");
            } else {
                results.add(String.valueOf(i));
            }
        }
        return results;
    }
}
