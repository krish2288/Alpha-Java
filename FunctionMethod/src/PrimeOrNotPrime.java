import java.util.Scanner;
public class PrimeOrNotPrime {
    public static Boolean isprime(int p) {
        // My code
//        boolean isprime=true;
//        //int name=Integer.parseInt("");
//        if (p == 2) {
//            System.out.println("prime");
//        }
//        else{
//            isprime = true;
//            for (int i = 2; i <= p - 1; i++) {
//                if (p % i == 0) {
//                    isprime = false;
//                }
//            }
//
//            if (isprime == true) {
//                System.out.println(p +" is prime Number");
//            } else {
//                   System.out.println(p+" is not prime Number");
//            }
//        }
       // return isprime;


        if (p==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(p);i++) {
            if(p%i==0){
                return false;
            }
        }
        return true;
   }

    public static void PrimeInRange(int p) {
        for(int i=2;i<=p;i++){
            if(isprime(i)){
                System.out.print(i+" ");
            }
        }

    }

        public static void main (String[]args){
            System.out.println("Enter your number");
            Scanner sc = new Scanner(System.in);
            int p = sc.nextInt();
            PrimeInRange(p);
          //  System.out.println(isprime(p));
        }
    }





