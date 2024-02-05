import java.awt.*;
import java.util.*;
public class Question {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        /*
        int n = sc.nextInt();

        if (n == 2) {
            System.out.print(n+" is prime");
        } else {
            boolean isPrime = true;
            for (int i = 2; i<=Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;

                }

            }

            if (isPrime == true) {
                System.out.print(n+" is prime");
            } else {
                System.out.print(n+" is not a prime");
            }
        }
         */
        // Q2
        /*
        int even = 0;
        int odd = 0;
        int choice;
        int number;

        do {
            System.out.println("Enter your no. ");
             number = sc.nextInt();
            if (number % 2 == 0) {
                even += number;
            } else {
                odd += number;
            }
            System.out.println("Do you want to continue? 1 for YES and 0 for NO ");
            choice=sc.nextInt();


        }while(choice==1);

        System.out.println("Sum of even number "+even);
        System.out.println("Sum of odd number "+odd);

         */

        // Q3
        System.out.println("enter your value");
        int fact=1;
        int n=sc.nextInt();
        for(int i=1; i<=n; i++) {
            fact*=i;
        }
        System.out.println(fact);




        // Q4
        /*
        System.out.println("enter your value");
        int n=sc.nextInt();

        for(int i=1; i<=10; i++){

            System.out.println(n+"*"+i+"="+n*i);
        }
         */



        }
    }
