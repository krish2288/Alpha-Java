public class MaxSubArraySum {
        public static void MaxSumofSubarrays(int num[]) {
            int add=0;
            int maxSum=Integer.MIN_VALUE;
            for(int i=0; i<num.length;i++) {
                int start = i;
                for (int j = i; j < num.length; j++) {
                    int end = j;
                    add=0;
                    for (int k = start; k <= end; k++) {
                        add+=num[k];
                    }
                    System.out.println(add);
                    if(maxSum<add){
                        maxSum=add;
                    }
                }
            }
            System.out.println("Max Sum="+maxSum);
        }
        public static void main(String[] args) {
            int num[]={1,-2,6,-1,3};
            MaxSumofSubarrays(num);
        }
}
