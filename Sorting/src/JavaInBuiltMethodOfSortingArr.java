import java.util.*;
public class JavaInBuiltMethodOfSortingArr {
    public static void PrintArr(Integer num[]) {
        for(Integer i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
    public static void main(String[] args) {
        Integer num[]={2,5,4,3,1,8,9,7,10,11,13,15,14,12,6};
        Arrays.sort(num);
        PrintArr(num);
    }
}
