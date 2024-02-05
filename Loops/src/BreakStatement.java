import  java.util.*;
public class BreakStatement {
    public static void main(String args[]){
        /*
        for(int i=1; i<=5; i++){
            if(i==3) {
                break;
            }
            System.out.print(i+" ");
        }
        System.out.print("\nout");

         */
        Scanner sc=new Scanner(System.in);

        do{
            System.out.print("Enter Your Number");
            int n=sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);
        }while(true);


    }
}

