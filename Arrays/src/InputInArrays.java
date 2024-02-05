import java.util.Scanner;

public class InputInArrays {
    public static void main(String[] args) {
        int marks[]=new int[100];
        Scanner sc=new Scanner(System.in);
        marks[0]=sc.nextInt();//phys
        marks[1]=sc.nextInt();//chemi
        marks[2]=sc.nextInt();//maths

        System.out.println("Physics = "+marks[0]);
        System.out.println("Chemistry = "+marks[1]);
        System.out.println("maths = "+marks[2]);

        //For Changing Value
       // marks[2]=100;
       // marks[2]+=1;
        //System.out.println("maths ="+marks[2]);
        int Avg=(marks[0]+marks[1]+marks[2])/3;
        System.out.println("Average ="+Avg);
    }
}
