public class BinarySearch {
    public static int BinarySearch(int number[], int key) {

        for(int start=0,end= number.length;start<end;){
           // System.out.println(end);
            int mid =(start+end)/2;
            //System.out.println(mid);
            if(number[mid]==key) {
                return mid;
            }
            if(number[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10,12,14};
        int key=14;
        System.out.println("index for key is "+BinarySearch(number,key));
        System.out.println(number.length);
    }
}
