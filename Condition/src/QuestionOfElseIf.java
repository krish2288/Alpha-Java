public class QuestionOfElseIf {
    public static void main(String args[]) {
        int A=1;
        int B=3;
        int C=6;
        if(A>B && A>C) {
            System.out.print("largest is A" );

        }
        else if(B>C){
            System.out.print("Largest is B");

        }
        else {
            System.out.print("largest is C");
        }
    }
}
