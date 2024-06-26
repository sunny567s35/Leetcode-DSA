public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        int n = A.length ;

        int missing =-1; int repeating =-1;
   
        int[] hash = new int[n+1];
        for(int i : A){
            hash[i]++;
        }
        for(int i =1 ; i <= n ;i++){
            if(hash[i] == 2){
                repeating =i;
            }
            else if(hash[i]==0){
                missing = i;
            }
            if(repeating != -1 && missing != -1){
                break;
            }
        }
        int[] ans = {repeating, missing};
        return ans;
    }
}
