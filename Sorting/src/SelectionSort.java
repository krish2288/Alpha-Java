public class SelectionSort {
    public static void sort(int num[]) {
        for(int turn=0;turn<num.length-1;turn++){
            int  minPose=turn;
            for(int j=turn+1;j<num.length;j++){
                if (num[minPose]>num[j]){
                    minPose=j;
                }
            }
            int temp=num[minPose];
            num[minPose]=num[turn];
            num[turn]=temp;

        }
    }

    public static void print(int num[]) {
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
    public static void main(String[] args) {
        int num[]={5,3,1,4,2};
        sort(num);
        print(num);
    }
}
