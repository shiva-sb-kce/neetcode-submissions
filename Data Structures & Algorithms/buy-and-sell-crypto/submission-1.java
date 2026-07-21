class Solution {
    public int maxProfit(int[] prices) {
        int min_price=prices[0];
        int max_prof=0;
        for(int i:prices){
            if (i<min_price){
                min_price=i;
            }
            int prof=i-min_price;
            if (prof>max_prof){
                max_prof=prof;
            }
        }
        return max_prof;
    }
}
