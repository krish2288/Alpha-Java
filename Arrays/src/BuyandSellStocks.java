public class BuyandSellStocks {
    public static int max_profit(int S_price[] ) {
        int min_buy=Integer.MAX_VALUE;
        int MAxprofit=0;
        for(int i=1;i<S_price.length;i++){
            if(min_buy<S_price[i]){
                int profit=S_price[i]-min_buy;
                MAxprofit=Math.max(MAxprofit,profit);
            }
            else {
                min_buy=S_price[i];
            }

            }
        return MAxprofit;
        }

    public static void main(String[] args) {
        int S_price[]={7,1,5,3,6,4};
        System.out.println(max_profit(S_price));
    }
}
