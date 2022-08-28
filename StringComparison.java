package String;

public class StringComparison {
    public static void main(String args[]) {
        String s1 = "Arijit";
        String s2 = "Arijit";
        String s3 = new String("Arijit");

        if(s1 == s2) {
            System.out.println("Strings are same.");
        } else {
            System.out.println("String are not same");
        }

        if(s1 == s3) {
            System.out.println("Strings are same");
        } else {
            System.out.println("Strings are not same");
        }
        if(s1.equals(s3)) {
            System.out.println("Strings are same");
        } else {
            System.out.println("Strings are not same");
        }
    }    
}
