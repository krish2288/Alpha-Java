public class DecimalToBinary {
    public static void DecToBinary(int Dec_num) {
        int Bin_num=0;
        int MyDec_num=Dec_num;

        for(int power=0;Dec_num>0;power++){
            int rem=Dec_num%2;
            Bin_num=Bin_num+(rem*(int)Math.pow(10,power));
            Dec_num/=2;
        }
        System.out.print("Binary of "+MyDec_num+" = "+Bin_num);
    }

    public static void main(String[] args) {
        DecToBinary(7);


    }
}
