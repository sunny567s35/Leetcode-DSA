class Solution {
    public int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for( int i= 0 ; i < prices.length ; i++){
            int num =prices[i];
            if(min>num){
                min = num;
            }
            max= Math.max(max,num-min);
        }
        return max;
    }
}