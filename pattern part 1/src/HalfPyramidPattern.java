import java.util.*;
public class HalfPyramidPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //int number=sc.nextInt();
        int number=4;
        for(int l=1;l<=number;l++){
            for(int n=1;n<=l;n++){
                System.out.print(n);
            }
            System.out.println();
        }
    }
}
