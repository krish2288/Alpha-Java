public class Maximumsumbyprefix {
    public static void max_sum(int num[]) {
        int curr_sum=0;
        int max_sum=Integer.MIN_VALUE;
        int prefix[]=new int[num.length];
        prefix[0]=num[0];
        // calculate prefix
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+num[i];
        }
        for(int i=0; i< num.length;i++){
            for(int j=i; j<num.length;j++){
                curr_sum= i==0?prefix[j]:prefix[j]-prefix[i-1];
               // System.out.println(curr_sum);
                if(max_sum<curr_sum){
                    max_sum=curr_sum;
                }
            }
        }
        System.out.println("maximum sum "+max_sum);
    }
    public static void main(String[] args) {
        int num[]={-2,-3,4,-1,-2,1,5,-3};
        max_sum(num);
    }
}
