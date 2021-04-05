class Solution {
    public int maxProfit(int[] prices) {
        int mxProfit = 0;
        int lowestPrice = prices[0];
        for(int i=1; i<prices.length; i++)
        {
            if(mxProfit < (prices[i] - lowestPrice))
                mxProfit = (prices[i] - lowestPrice);
            if(prices[i] < lowestPrice)
                lowestPrice = prices[i];
        }
        
        return mxProfit;
        
    }
}