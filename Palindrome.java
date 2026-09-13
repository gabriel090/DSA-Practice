public class Palindrome {
    public static void main(String[] args) {
        String word = "that";
        System.out.println(isPalindrome(word));

    }
    public static boolean isPalindrome(String word){
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = word.length() -1;
        while(start < end){
            if(charArray[start] != charArray[end]){
                return  false;
            }
            start++;
            end --;
        }


        return  true;
    }
}
