public class BinaryToDecimal {
    public static void DecToBin(int bin_num) {
        int dec_num=0;
        int MyBin_num=bin_num;

        for(int power=0;bin_num>0;power++){
            int last_digit=bin_num%10;
            dec_num=dec_num+(last_digit*(int)Math.pow(10,power));
            bin_num=bin_num/10;
        }
        System.out.print("Decimal of "+MyBin_num+" = "+dec_num);
    }

    public static void main(String[] args) {
        DecToBin(101);
    }
}
