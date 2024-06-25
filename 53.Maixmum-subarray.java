class Solution {
    public int maxSubArray(int[] nums) {
        int sum =0 ;
        int max= Integer.MIN_VALUE;

        for(int e : nums){
            if(sum < 0){
                sum=0;
            }
            sum+=e;
            max = Math.max(max,sum);
        }
    return max;
    }

}