public class StringPractice {
    public static void main(String[] args) {
        // Repeats matter: without a second 'l' / second "hello", fromIndex looks the same as the first hit
        stringTest("hellohello");

        // stringTestArr(new String[] { "flower", "flow", "flight" });
    }

    // Scenario 1: the four indexOf overloads
    public static void stringTest(String s) {
        //  s = "hellohello"
        //  index: 0 1 2 3 4 5 6 7 8 9
        //  char:  h e l l o h e l l o
        //
        //  Every indexOf answers: WHERE does this start?
        //  Missing → -1. Found → the index of the FIRST character of the match.
        //  fromIndex = "do not look at anything before this index"

        System.out.println("s = " + s);
        System.out.println("index: 0 1 2 3 4 5 6 7 8 9");
        System.out.println("char:  h e l l o h e l l o");

        // 1) indexOf(int ch)  — first 'l' from the start of the string
        System.out.println("--- 1) indexOf(int ch) ---");
        System.out.println("indexOf('l')     = " + s.indexOf('l'));   // 2
        System.out.println("indexOf('z')     = " + s.indexOf('z'));   // -1

        // 2) indexOf(int ch, int fromIndex)  — first 'l' at or after fromIndex
        System.out.println("--- 2) indexOf(int ch, int fromIndex) ---");
        System.out.println("indexOf('l', 0)  = " + s.indexOf('l', 0)); // 2  same as (1)
        System.out.println("indexOf('l', 3)  = " + s.indexOf('l', 3)); // 3  skipped index 2
        System.out.println("indexOf('l', 4)  = " + s.indexOf('l', 4)); // 7  skipped the first "ll"
        System.out.println("indexOf('l', 9)  = " + s.indexOf('l', 9)); // -1 nothing left

        // 3) indexOf(String str)  — first whole substring from the start
        System.out.println("--- 3) indexOf(String str) ---");
        System.out.println("indexOf(\"hello\") = " + s.indexOf("hello")); // 0
        System.out.println("indexOf(\"llo\")   = " + s.indexOf("llo"));   // 2
        System.out.println("indexOf(\"xyz\")   = " + s.indexOf("xyz"));   // -1

        // 4) indexOf(String str, int fromIndex)  — first whole substring at or after fromIndex
        System.out.println("--- 4) indexOf(String str, int fromIndex) ---");
        System.out.println("indexOf(\"hello\", 0) = " + s.indexOf("hello", 0)); // 0
        System.out.println("indexOf(\"hello\", 1) = " + s.indexOf("hello", 1)); // 5  skipped first "hello"
        System.out.println("indexOf(\"hello\", 6) = " + s.indexOf("hello", 6)); // -1
    }

    // Scenario 2: work with MANY strings
    public static void stringTestArr(String[] arr) {
        // We begin here: two words, one question.
        //
        //  arr[0] = "flower"  → we call this prefix (the candidate start)
        //  arr[1] = "flow"    → we call this next   (the word we test)
        //
        //  next.indexOf(prefix) asks: WHERE does "flower" sit inside "flow"?
        //
        //    0  → "flow" STARTS with "flower"   (found at the beginning)
        //   >0  → found, but not at the start   (example: "xxflower")
        //   -1  → not found at all

        String prefix = arr[0];
        String next = arr[1];
        System.out.println("--- compare \"" + next + "\" against prefix \"" + prefix + "\" ---");
        System.out.println("next.indexOf(prefix) = " + next.indexOf(prefix));
        System.out.println("prefix.indexOf(next) = " + prefix.indexOf(next));

        System.out.println("starts with prefix?  = " + (next.indexOf(prefix) == 0));
    }
}
