public class InsertionSort {
    public static void sort(int num[]) {
        for (int i=1;i<num.length;i++){
            int curr=num[i];
            int prev=i-1;
             while(prev>=0&&num[prev]>curr){
                 num[prev+1]=num[prev];
                 prev--;
             }
             num[prev+1]=curr;
        }
    }
    public static void print(int num[]) {
        for (int i=0;i< num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
    public static void main(String[] args) {
        int num[]={3,2,4,5,1};
        sort(num);
        print(num);
    }
}
