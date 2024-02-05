public class Binomial {
    public static long factorial (int a){
        long f=1;
        for(long i=1;i<=a;i++){
            f*=i;
        }
        return f;
        }
    public static  long binocoff(int n,int r) {
        long fact_n=factorial(n);
        long fact_r=factorial(r);
        long fact_psm=factorial(n-r);

        long co = fact_n / (fact_r * fact_psm);
        return co;
    }
    public static void main(String[] args) {

        System.out.println(binocoff(15,2));
    }
}
