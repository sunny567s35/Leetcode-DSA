class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map  = new HashMap<>();
        for(int e : nums){
            if(map.containsKey(e)){
                map.put(e,map.get(e)+1);
                return e;
            }
            else{
                map.put(e,1);
            }
        }
        return 0;
    }
}