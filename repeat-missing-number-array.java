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

//optimal soltuino using maths formula 

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] a) {
        long n = a.length;
        
        long sn = (n*(n+1))/2;
        long s = 0;
        long s2n = (n*(n+1)*(2*n+1))/6;
        long s2 = 0;
        for (int i = 0; i < n; i++) {
            s += a[i];
            s2 += (long)a[i] * (long)a[i];
        }
        long val1 = s-sn;
        long val2 = s2-s2n;
        val2 = val2/val1;
        long x = (val2+val1)/2;
        long y = x-val1;
          int[] ans = {(int)x, (int)y};
        return ans;
    }
}
