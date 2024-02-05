import java.util.Scanner;

public class QuestionOfFunction {

    //Q1
    /*
   // public static void average() {
//        int a=2;
//        int b=3;
//        int c=4;
//        System.out.println((a+b+c)/3);
//   }
   public static double average (int a,int b,int c) {
       double aver=(a+b+c)/3d;
               return aver;
   }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        System.out.println(average(a,b,c));
    }*/

    // Q2
    /*
    public static boolean iseven(int a) {

        if( a%2==0){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(iseven(a));
        if(iseven(a)){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }

    }*/
    //Q3
   /* public static void palindrome(int n) {
        int palindrome=n;
        int rev=0;
            while(palindrome!=0) {
                int lastdigit = palindrome % 10;
                 rev= rev*10+lastdigit;
                 palindrome/=10;
            }
            System.out.println(rev);
            if(n==rev){
                System.out.println("Number is palindrome");
                //return true;
            }
            else {
                System.out.println("Number is not palindrome");
                //return false;
            }
        }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
       // System.out.println(palindrome(a));
        palindrome(a);

    }*/
    //Q4
//    public static int SumofDigits(int a) {
//        int sumofdigit=0;
//        while(a>0){
//           int lastdigit=a%10;
//           sumofdigit+=lastdigit;
//           a/=10;
//        }
//        return sumofdigit;
//
//    }
//
//    public static void main(String[] args) {
//        System.out.println(SumofDigits(39));
//    }

    public static void main(String[] args) {


        int a = 1271;

        if (a % 31==0&&a%41==0) {
            System.out.println("foo Bar");
        }

   else if(a%41==0){
            System.out.println("bar");
        }
        else if (a%31==0){
            System.out.println("foo");
        }

    }
}