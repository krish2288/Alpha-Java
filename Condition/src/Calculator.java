import java.util.*;
public class Calculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  Your 1st Value: ");
        int a=sc.nextInt();

        System.out.println("Enter Your 2nd Value: ");
        int b=sc.nextInt();

        System.out.println("Enter Your Operator: ");
        char operator=sc.next().charAt(0);

        switch (operator) {
            case '+' : System.out.print(a+b);
            break;
            case '-' : System.out.print(a-b);
            break;
            case '*' : System.out.print(a*b);
            break;
            case '/' : System.out.print(a/b);
            break;
            case '%' : System.out.print(a%b);
            break;
            default: System.out.print("wrong operator");

        }

    }
}
