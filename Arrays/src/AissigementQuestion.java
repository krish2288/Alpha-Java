public class AissigementQuestion {
  //  Q1

//    public static boolean Check (int num[]) {
//        for(int i=0;i<num.length;i++){
//            for(int j=i+1;j< num.length;j++){
//                if(num[i]==num[j]){
//                    return true;
//                }
//
//            }
//
//        }
//        return false;
//    }
//    public static void main(String[] args) {
//        int num[]={1,2,3,1};
//        System.out.println(Check(num));
//
//    }

    // Q3
//    public static int max_profit(int num[]) {
//        int min_buy=Integer.MAX_VALUE;
//        int max_profit=0;
//        for(int i=0;i<num.length;i++){
//            if(min_buy<num[i]){
//                int profit=num[i]-min_buy;
//                max_profit=Math.max(max_profit,profit);
//            }
//            else {
//                min_buy=num[i];
//            }
//        }
//        return max_profit;
//    }
//    public static void main(String[] args) {
//        int num[]={7,6,4,3,1};
//        System.out.println(max_profit(num));
//    }


    // Q4
//    public static int water(int num[]) {
//        int left_max[]=new int[num.length];
//        left_max[0]=num[0];
//        for(int i=1;i< num.length;i++){
//            left_max[i]=Math.max(left_max[i-1],num[i] );
//        }
//        int right_max[]=new int[num.length];
//        right_max[num.length-1]=num[num.length-1];
//        for (int i= num.length-2;i>=0;i--){
//            right_max[i]=Math.max(num[i],right_max[i+1]);
//        }
//        int trapped_water=0;
//        for(int i=0;i< num.length;i++){
//             trapped_water+=Math.min(left_max[i],right_max[i])-num[i];
//        }
//        return trapped_water;
//    }
//    public static void main(String[] args) {
//        int num[]={4,2,0,3,2,5};
//        System.out.println(water(num));
//
//    }

    // Q5

}
