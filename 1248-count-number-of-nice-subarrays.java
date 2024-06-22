class Solution {
    static int fun(int[] nums , int k){
        
         if(k0)return 0;
         int res =0; int l=0;int r =0;
         int odd=0;
         while (rnums.length){
            odd+=nums[r]%2;

            while(oddk){
                odd-=nums[l]%2;
                l+=1;
            }

            
                res += r-l+1;
            
            r++;
         }
         return res;
    }
    public int numberOfSubarrays(int[] nums, int k) {

         return fun(nums,k)-fun(nums,k-1);
    }
}