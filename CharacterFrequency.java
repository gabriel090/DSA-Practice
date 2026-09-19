// Pattern: Character frequency counting
//
// What: walk the string once, and count how many times each letter appears.
// We are NOT solving a LeetCode problem yet. Only the count.
//How you know a question wants this
//
//Read the question and look for ideas like:
//
//how many times a letter appears
//most / least common letter
//        same letters, maybe in a different order (later: anagrams)
//can these two words use the same letters
//make the string all one letter if we “ignore” some characters

public class CharacterFrequency {
    public static void main(String[] args) {
        countLetters("apple");
        System.out.println("======== hashmap ========");
        countLettersHashMap("apple");
    }

    public static void countLetters(String s) {
        //  s = "banana"
        //  index: 0 1 2 3 4 5
        //  char:  b a n a n a
        //
        //  26 boxes, one for each letter a..z
        //  box 0 is 'a', box 1 is 'b', ... box 25 is 'z'
        //  trick:  count[c - 'a']  is the box for character c
        //    'a' - 'a' = 0
        //    'b' - 'a' = 1
        //    'n' - 'a' = 13

        int[] count = new int[26];
        // Time:  one loop over n letters  ->  O(n)
        //        then a loop over 26 boxes ->  O(1)  (26 never grows)
        // Space: 26 boxes, not n boxes     ->  O(1) extra space
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count[c - 'a']++;
        }

        System.out.println("s = " + s);
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                char letter = (char) ('a' + i);
                System.out.println(letter + " appears " + count[i] + " time(s)");
            }
        }

        // Next practice: use the table. Do not count the string again.
        printMostFrequent(count);
    }

    // Walk the 26 boxes. Remember the tallest one.
    public static void printMostFrequent(int[] count) {
        int bestBox = 0;
        for (int i = 1; i < 26; i++) {
            if (count[i] > count[bestBox]) {
                bestBox = i;
            }
        }
        char letter = (char) ('a' + bestBox);
        System.out.println("most frequent = " + letter + " (" + count[bestBox] + " time(s))");
    }

    // Same job, different box: key = letter, value = how many times.
    // No c - 'a'. Works even if the string is not only a-z.
    public static void countLettersHashMap(String s) {
        java.util.Map<Character, Integer> count = new java.util.HashMap<>();

        // Time:  one loop over n letters, each put/get is average O(1)  ->  O(n)
        // Space: one entry per DISTINCT letter (apple -> 4 keys)        ->  O(k)
        //        k is at most n. For a-z, k is at most 26.
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int soFar = count.getOrDefault(c, 0);
            count.put(c, soFar + 1);
        }

        System.out.println("s = " + s);
        for (java.util.Map.Entry<Character, Integer> entry : count.entrySet()) {
            System.out.println(entry.getKey() + " appears " + entry.getValue() + " time(s)");
        }

        printMostFrequentHashMap(count);
    }

    public static void printMostFrequentHashMap(java.util.Map<Character, Integer> count) {
        char best = '?';
        int bestTimes = 0;
        for (java.util.Map.Entry<Character, Integer> entry : count.entrySet()) {
            if (entry.getValue() > bestTimes) {
                bestTimes = entry.getValue();
                best = entry.getKey();
            }
        }
        System.out.println("most frequent = " + best + " (" + bestTimes + " time(s))");
    }
}
