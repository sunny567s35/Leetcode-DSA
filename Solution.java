public class Solution {
    
        public int longestSubarray(int[] nums, int limit) {
            Deque<Integer> max = new LinkedList<>();
            Deque<Integer> min = new LinkedList<>();
            int l =0 ; int result=0;
            for(int r =0 ; r<nums.length ;r++){
    
                while(!max.isEmpty() && nums[max.peekLast()] <= nums[r]){
                    max.pollLast();
                }
                max.addLast(r);
                while(!min.isEmpty() && nums[min.peekLast()] >= nums[r]){
                    min.pollLast();
                }
                min.addLast(r);
                int diff =nums[max.peekFirst()]-nums[min.peekFirst()];
                if(!max.isEmpty() && !min.isEmpty()&& l<r && diff>limit){
                    l++;
                    if(!max.isEmpty()&& max.peekFirst() < l){
                        max.pollFirst();
                    }
                    if(!min.isEmpty()&& min.peekFirst() < l){
                        min.pollFirst();
                    }
                    
                }result =Math.max(result,r-l+1);
                
            }
            return result;
        }
    
}
