public class Question {
    public static void BubbleSort(int num[]) {
        for (int turn=0;turn<num.length-1;turn++) {
            for (int j = 0; j < num.length - 1 - turn; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
    }

    public static void SelectionSort(int num[]) {
        for(int turn=0;turn<num.length;turn++){
            int minPosition=turn;
            for (int j=turn+1;j<num.length;j++){
                if(num[minPosition]>num[j]){
                    minPosition=j;
                }
            }
            int temp=num[minPosition];
            num[minPosition]=num[turn];
            num[turn]=temp;

        }
    }

    public static void InsertionShort(int num[]) {
        for (int i=1;i<num.length;i++){
            int curr=num[i];
            int prev=i-1;
            while(prev>=0&&num[prev]>curr){
                num[prev+1]=num[prev];
                prev--;
                System.out.println(prev);
            }
            num[prev+1]=curr;
        }
    }

    public static void PrintArray(int num[]) {
        for (int i=0;i< num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
    public static void main(String[] args) {
        int num[]={4,6,1,5,3,2,9};
       // BubbleSort(num);
       // SelectionSort(num);
        InsertionShort(num);
        PrintArray(num);
    }
}
