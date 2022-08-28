package String;

public class AssignmentQThree {
    public static void main(String args[]) {
        /*
         * What will be the output of the following code?
         */
        String str = "ApnaCollege".replace("Apna", "My");
        System.out.println(str);//Output: MyCollage
        String str1 = "ApnaCollege".replace('a', 'e');
        System.out.println(str1);//output: ApneCollege
    }
}
