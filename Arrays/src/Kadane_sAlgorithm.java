public class Kadane_sAlgorithm {
    public static void max_sum(int num[]) {
        int curr_sum=0;
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i< num.length;i++){
             curr_sum=curr_sum+num[i];
             if(curr_sum<0){
                 curr_sum=0;
             }
             max_sum=Math.max(curr_sum,max_sum);
        }
        System.out.println(max_sum);
    }
    public static void main(String[] args) {
        int num[]={-2,-3,4,-1,-2,1,5,-3};
        max_sum(num);
    }
}
