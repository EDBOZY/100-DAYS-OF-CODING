// 122. Best Time to Buy and Sell Stock II

// You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

// On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.

// Find and return the maximum profit you can achieve.


                                                                              //ANSWERS
// I SIMPLY CHECKE IF THE ARRAY ELEMENT IS GREATER THAN THE PREVIOSUS ELEMENT IF ITS GREATER IT WILL SUBTRACT AND ADD IT TO THE PROFIT SUM.


class Solution {
    public int maxProfit(int[] prices) {
        int p=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                p=p+prices[i]-prices[i-1];
            }
        }

    return p;   
    }
    
}
