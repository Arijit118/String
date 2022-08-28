package String;

public class InternFunction {
    public static void main(String args[]) {

        String str = new String("Earth"); //Statement 1
        String str1 = new String("Earth"); //statement 2
        System.out.println(str==str1);//Output false

        /*
         * When a string is created in Java, it occupies memory in the heap. 
         * Also, we know that the String class is immutable. 
         * Therefore, whenever we create a string using the new keyword, 
         * new memory is allocated in the heap for corresponding string, 
         * which is irrespective of the content of the array.
         * 
         * The println statement prints false because separate memory is allocated for each string literal. 
         * Thus, two new string objects are created in the memory i.e. str and str1. 
         * that holds different references.
         */

        String str2 = new String("Earth").intern(); //Statement 1
        String str3 = new String("Earth").intern(); //statement 2
        System.out.println(str2==str3);//Output true

        /*
         * In the above code snippet, the intern() method is invoked on the String objects. 
         * Therefore, the memory is allocated in the SCP(String Constant Pool). 
         * For the second statement, no new string object is created as the content of str and str1 are the same. 
         * Therefore, the reference of the object created in the first statement is returned for str1. 
         * Thus, str and str1 both point to the same memory. Hence, the print statement prints true.
         */

    }
}
