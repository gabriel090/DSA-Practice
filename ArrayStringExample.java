public class ArrayStringExample {
    public static void main(String[] args) {
        String s = "Hello!";
        String t = "Hello";
       int len = s.length(); // s.length() Gets the total count of character
        char c = s.charAt(0);// s.charAt(i); Retrieves the character at a specific index
        String sub =  s.substring(1,4);// Extract a part of the string (end ind is exclusive
        int idx = s.indexOf('e'); //s.indexOf(target); Finds the first index of a char/substring; return -1 if absent
        char[] arr = s.toCharArray(); // Coverts the string into a char[] array for fast manipulation. s.toCharArray();
        boolean same = s.equals(t);// compares string contents for equality, never use ==
//        String value = s.valueOf(123);
//        System.out.println("Same "+same);
//        System.out.println("Length "+len);
//        System.out.println("index "+idx);
//        System.out.println("Character array: " +arr);
//        System.out.println("Character at "+c);
//        System.out.println("Sub string "+sub);
//        System.out.println("Value "+value);

        String[] str = { "flower", "flow", "flight" };
       String prefix = str[0];
      for ( int i = 1; i < str.length; i++ ) {
          System.out.println(str[i].indexOf(prefix));
//          while(str[i].indexOf(prefix) != 0) {
//              prefix = prefix.substring(0, prefix.length() - 1);
//              System.out.println(prefix);
//          }


      }





    }
}
