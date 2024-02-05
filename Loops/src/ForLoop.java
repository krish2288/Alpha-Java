import java.util.*;
public class ForLoop {
    public static void main(String args[]) {
        /*
        for(int i=1;i<=10;i++) {
            System.out.println("Hello World");
            }
         */

        // Q Print Square Pattern
        /*
        for(int Line=1; Line<=4; Line++) {
            System.out.println("* * * *");
            }
         */

        // Q Print Reverse of a number
        /*
        for(int n=10899; n>0; n/=10){
            int lastdigit=n%10;
            System.out.print(lastdigit);
        }
         */

        // Q Reverse the given number

        for( int n=10899; n>0; n/=10) {
            int rev=0;
            int lastdigit=n%10;
            rev=(rev*10)+lastdigit;
            System.out.print(rev);
        }
    }
}
