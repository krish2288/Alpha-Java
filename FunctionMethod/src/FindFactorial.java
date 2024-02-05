public class FindFactorial {
    public static long factorial(long a) {
        long f = 1;
        for (long i = 1; i <= a; i++) {
            f *= i;
        }
        return f;
    }

    public static void main(String[] args) {

        System.out.println(factorial(13));
    }
}


