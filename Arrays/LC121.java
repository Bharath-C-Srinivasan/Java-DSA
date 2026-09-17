//121. Best Time to Buy and Sell Stock
/*You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing 
a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0. */

package Arrays;

public class LC121 {
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int price: prices){
            if(price < minprice){
                minprice = price;
            }
            if(price - minprice > maxprofit){
                maxprofit = price - minprice;
            }
        }
        return maxprofit;
    }
}
