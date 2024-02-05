import java.util.*;
public class Elseif {
    public static void main(String args[]){
        System.out.println("What is your age");
   Scanner sc = new Scanner(System.in);
   int age = sc.nextInt();


        if(age >=18){
            System.out.println("Adult");
        }
        else if(age > 13 && age <18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Not adult");
        }

    }


}
