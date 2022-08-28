package String;
import java.util.*;
public class Creation {
    public static void main(String args[]) {
        char arr[] = {'a', 'b', 'c', 'd'};
        String str = "abcd";
        String str2 = new String("abcd");

        /*
         * In java strings are IMMUTABLE(unchanging over time or unable to be changed).
         */
        /*
         * How to take input string from user and output that string
         */
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Your entered string:"+name);

        /*
         * Calculete length of String by length() function
         */
        System.out.println("Length of the entered string is:"+name.length());

        /*
         * Concatenation
         */
        String firstName = "Arijit";
        String lastName = "Roy";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
    }
}
