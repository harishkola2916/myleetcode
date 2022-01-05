class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        
        if(prices.length <= 1)
            return 0;
        else
        {
            int daystock = prices[0];
               for(int i=1;i<prices.length;i++)
            {
            maxprofit = Math.max(maxprofit,prices[i]-daystock);
            daystock = Math.min(daystock,prices[i]);
            
        }
        }
     
        return maxprofit;
    }
}