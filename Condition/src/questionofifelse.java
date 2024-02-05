import java.util.*;
public class questionofifelse {
    public static void main(String args[]) {
        // Q1
        /*
        int A = 1;
        int B = 3;
        if(A>B){
            System.out.println("A is largest of 2");
        }
        else{
            System.out.println("B is Largest of 2");
        }

         */
        // Q2
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        if(Number%2==0) {
            System.out.println("Number is Even");
        }
            else{
                System.out.println("Number is Odd");

            }

    }
}
