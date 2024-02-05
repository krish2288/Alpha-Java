import java.util.*;
import java.lang.*;
import java.io.*;

class cc
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int p1=sc.nextInt();
        int p2=sc.nextInt();
        int p3=sc.nextInt();
        int p4=sc.nextInt();

        int Num[]={p1,p2,p3,p4};
        int b=0;
        for(int a:Num){
            if(a>=10){
                b++;
            }
        }
        System.out.println(b);
    }
}
