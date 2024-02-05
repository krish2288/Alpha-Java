import java.util.*;
public class WhileLoop {
    public static void main(String[] args) {

        // Q Print hello world 100 times
        /*
        int counter=0;
         while(counter<=100) {
             System.out.println("Hello World");
             counter++;
         }
         */

        // Q Print number 1 to 10
        /*
        int i=1;
        while(i<=10) {
            System.out.print(number+" ");
            i++;
        }
         */
        // Q Print number from 1 to n
        /*
        Scanner sc= new Scanner(System.in);
        int i=1;
        int n= sc.nextInt();

        while (i<=n) {
            System.out.print(number+" ");
            i++;
        }
         */

        // Q Print sum of first n natural numbers

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int i=1;
        while (i<=n){
            sum +=i;
            i++;
        }
        System.out.println(sum);


         System.out.println("\nover");
    }
}