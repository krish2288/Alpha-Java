public class BubbleSort {
    public static void Sorting(int num[]) {
        for(int turns=0;turns<num.length-1;turns++){
            boolean swapped=false;
           for (int j=0;j<num.length-1-turns;j++){
               if(num[j]>num[j+1]){
                   int temp=num[j];
                   num[j]=num[j+1];
                   num[j+1]=temp;
                   swapped=true;
                }
           }
           if(!swapped)
               break;
        }
    }

    public static void print(int num[]) {
        for(int i=0;i< num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
    public static void main(String[] args) {
        //int num[]={5,4,1,3,2};
        int num[]={1,2,3,5,4,6};
        Sorting(num);
        print(num);
    }
}