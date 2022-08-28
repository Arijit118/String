package String;
import java.lang.reflect.Array;
import java.util.Arrays;

public class AnagramString {
    public static void isAnagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if(str1.length() == str2.length()) {
            //Convert String into char array
           char str1CharArray[] = str1.toCharArray(); 
           char str2CharArray[] = str2.toCharArray();

           //Sort the char array
           Arrays.sort(str1CharArray);
           Arrays.sort(str2CharArray);           
           boolean result = Arrays.equals(str1CharArray, str2CharArray);
           if(result) {
            System.out.println(str1+" and "+str2+" are anagrams.");
           } else {
            System.out.println(str1+" and "+str2+" are not anagrams.");
           }
        } else {
            System.out.println(str1+" and "+str2+" are not anagrams.");
        }
    }
    public static void main(String args[]) {
        /*
         * Determine if 2 Strings are anagrams of each other.
         * What are anagrams?
         * If two strings contain the same characters but in a different order,
         * they can be said to be anagrams.
         * Ex. race and care
         */
        String str1 = "Earth";
        String str2 = "Heart";
        isAnagram(str1, str2);
    }
}
