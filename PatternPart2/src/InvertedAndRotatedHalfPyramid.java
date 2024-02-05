public class InvertedAndRotatedHalfPyramid {

        public static void InvertedAndRotatedHalfPyramid(int n) {
            // MY VIEW
//            for (int i=1;i<=totRows;i++){
//                for (int j=1;j<=totCols;j++){
//                    if(i==totRows||j==totCols||i==2&&j==3||i==3&&j==3||i==3&&j==2){
//                        System.out.print("*");
//                    }
//                    else {
//                        System.out.print(" ");
//                    }
//
//                }
//                System.out.println();
//            }
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
            InvertedAndRotatedHalfPyramid(10);

        }
    }


