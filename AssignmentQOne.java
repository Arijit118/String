package String;
import java.util.*;
public class AssignmentQOne {
    public static int countVowels(String str) {
        int count = 0;
        for(int i=0; i<str.length();i++) {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]) {
        /*Question:
         * Count how many times lower case vowels occurred in a String entered by the user.
         */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(countVowels(str));
    }
}
