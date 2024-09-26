import java.util.HashMap;
class Solution {
    public int longestPalindrome(String s) {
        int[] charCount = new int[128];
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charCount[c]++;
            // If a pair is found, add 2 to the count
            if (charCount[c] % 2 == 0) {
                count += 2;
            }
        }
        // If the length of the palindrome is less than the length of the string,
        // then at least one character can be placed in the center.
        if (count < s.length()) {
            return count + 1;
        }
        return count;
    }
}
public class longest_Palindrome {


    public static void main(String[] args) {
        String s = "abccccdd";
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0) + 1);
        }
        System.out.println(map);
        int count = 0;
        boolean oddDetected = false;
       for (int x : map.values()){
           if (x % 2 == 0)count += x;
           else {
               oddDetected = true;
               count += x - 1;
           }
       }
       if (oddDetected)count++;
    }
}
