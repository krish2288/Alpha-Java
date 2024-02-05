public class AdditionOfAllSubarrays {
        public static void Subarrays(int num[]) {

            int ts=0;
            int add=0;
           //int max_sum=Integer.MIN_VALUE;
            for(int i=0; i<num.length;i++){
                int start=i;

             for (int j=i;j<num.length;j++){
                    int end=j;
                    add=0;

                    for (int k=start;k<=end;k++){
                       System.out.print(num[k]+" ");
                        add+=num[k];
                    }
                     System.out.print(",addition of sub array "+add);

                    // to find maximum sum of sub array

                  //  if(max_sum<add){
                       // max_sum=add;
                  //  }
                    System.out.println();
                    ts++;
               }
                System.out.println();

            }System.out.println("Total subarrays "+ts);

           // System.out.println("Total no.subarrays "+num.length* (num.length+1)/2);
           // System.out.println("maximum sum "+max_sum );
        }
        public static void main(String[] args) {
            int num[]={2,4,6,8,10};
            Subarrays(num);
        }
  // }

}
