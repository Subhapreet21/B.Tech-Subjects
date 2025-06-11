import java.util.*;
public class FinalPricesWithDiscount {
    public static int[] finalPrices(int[] prices){
        int n=prices.length;
        int[] result=new int[n];
        for (int i=0;i<n;i++){
            result[i]=prices[i];
            for (int j=i+1;j<n;j++){
                if (prices[j]<=prices[i]){
                    result[i]=prices[i]-prices[j];
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] prices={10,7,8,4,6};
        int[] finalPrices=finalPrices(prices);
        System.out.println("Final Prices: "+Arrays.toString(finalPrices));
    }
}
