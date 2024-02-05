import java.util.*;
public class ConditionalQuestion {
    public  static  void main(String args[]){
       // Q1
        /*
        System.out.print("Enter Your Number: ");
        Scanner sc=new Scanner(System.in);
        int Number =sc.nextInt();
        if(Number>=0){
            System.out.print("Number enter by you is Positive");
        }
        else{
            System.out.print("Number enter by you is Negative");
        }
         */

        // Q2
        /*
        Scanner sc= new Scanner(System.in);
        double temp=sc.nextDouble();
        if(temp>100){
            System.out.print("You have Fever");
        }
        else{
            System.out.print("You not have Fever");
        }
         */

       // Q3

                Scanner sc=new Scanner(System.in);
                System.out.println("Enter  Your Week Number: ");
                int week=sc.nextInt();


                switch (week) {
                    case 1 : System.out.print("Monday");
                        break;
                    case 2 : System.out.print("Tuesday");
                        break;
                    case 3 : System.out.print("Wednesday");
                        break;
                    case 4 : System.out.print("Thursday");
                        break;
                    case 5 : System.out.print("Friday");
                        break;
                    case 6 : System.out.print("Saturday");
                    break;
                    case 7 : System.out.print("Sunday");
                    break;
                    default: System.out.print("wrong:Enter number between 1-7");

                }





        // Q5
        /*
        Scanner sc = new Scanner(System.in);
        int Year = sc.nextInt();
        boolean x=Year%4==0;
        boolean y=Year%100!=0;
        boolean z=Year%400==0;


        if(x&&(y||z)){
            System.out.print("Enter Year is not Leap Year");

        }
        else{
            System.out.print("Enter Year is Not a Leap Year");

        }

         */



    }
}
