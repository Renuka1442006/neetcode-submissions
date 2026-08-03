class Solution {
    public int maxProfit(int[] prices) {
        // int maxprofit=0;
        // int i=0;
        // int j=prices.length-1;
        // while(i<j)
        // {
        //     if(prices[j]>prices[i])
        //     {
        //         maxprofit=Math.max(maxprofit,prices[j]-prices[i]);
        //         j--;
        //     }
        //     if(prices[i]>prices[j])
        //     {
        //         i++;
        //     }
           
        // }
        // return maxprofit;
        int maxprofit=0;
        int n=prices.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(prices[j]>prices[i])
                {
                    maxprofit=Math.max(maxprofit,prices[j]-prices[i]);
                }
            }
        }
        return maxprofit;
    }
}
