public class AssignmentOperators {
    public static void main(String args[]) {
        int A = 10;
        int B = 10;
        int C = 10;
        int D = 10;
        int E = 10;
/*
        A = A + 10;
        B = B + 10;
        C = C * 10;
        D = D / 10;
        E = E % 10;

 */


        // It is faster than A+10

       A+=10;
       B-=10;
       C*=10;
       D/=10;
       E%=10;


        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);



    }
}
