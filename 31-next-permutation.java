class Solution {
    private void reverse(int[] nums, int start, int end) {
     while (start < end) {
         int temp = nums[start];
         nums[start] = nums[end];
         nums[end] = temp;
         start++;
         end--;
     }
 }
 public void nextPermutation(int[] nums) {
     int pos =-1;
     for(int i=nums.length-2; i>=0; i-- ){
             if(nums[i]<nums[i+1]){
                     pos =i;
                 break;
             }
     }
     System.out.println(pos);
     if(pos==-1){
         Arrays.sort(nums);
         return;
     }

     for(int i =nums.length -1; i > pos ; i--){
             if(nums[i]>nums[pos]){
                 int temp = nums[i];
                 nums[i] = nums[pos];
                 nums[pos] = temp;
                 break;
             }
     }
     reverse(nums,pos+1,nums.length-1);

 }
}