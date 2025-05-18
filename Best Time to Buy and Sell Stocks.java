class Solution {
    public int maxProfit(int[] prices) {
     
        int low = prices[0];
        int maxProfit = 0;

        for(int i=1; i<prices.length; i++){

            if(low>prices[i]){
                low = prices[i];
            }
            else{
                int profit =prices[i] - low;
                if(profit>maxProfit){
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;


    }
}
