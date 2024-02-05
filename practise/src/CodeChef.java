import java.util.*;
import java.lang.*;
import java.io.*;

class CodeChef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();

        for(int i=0;i<T;i++){
            int N=sc.nextInt();
            int max=N;
            int min;
            if(N<2){
                min=N;
            }
            if(N%2==0){
                min=N/2;
            }
            else{
                min=(N/2)+1;
            }
            System.out.print(min+" "+max);
        }

    }
}
