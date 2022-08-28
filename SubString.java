package String;

public class SubString {
    public static String printSubString(String str, int si, int ei) {
        String subStr = " ";
        for(int i=si; i<ei; i++) {
            subStr += str.charAt(i);
        }
        return subStr;
    }
    public static void main(String args[]) {
        String str = "HelloWorld";
        //String subString = printSubString(str, 3, 5);
        //System.out.println(subString);

        /*
         * Java has a built in function for find sub-string
         */
        String subString = str.substring(0,5);
        System.out.println(subString);

    }
}
