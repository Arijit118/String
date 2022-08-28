package String;

public class PallindromeString {
    public static boolean checkPallindrome(String str) {
        int n = str.length();
        for(int i=0; i<=n/2; i++) {
            if(str.charAt(i) == str.charAt(n-i-1)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]) {
        /*
         * racecar, madam, noon etc
         */
        String str = "tree";
        System.out.println(checkPallindrome(str));
    }
}
