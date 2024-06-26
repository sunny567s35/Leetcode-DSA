class Solution {
    public int[][] merge(int[][] intervals) {
        //sort arr
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        int[] CurrentInterval = intervals[0];
        List<int[]> res = new ArrayList<>();
        res.add(CurrentInterval);
        //for
        for(int[] interval : intervals){
            int CurrentEnd = CurrentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            if(CurrentEnd >= nextStart){
                CurrentInterval[1] = Math.max(CurrentInterval[1],nextEnd);

            }
            else{
                CurrentInterval = interval;
                res.add(CurrentInterval);
            }

        }
        return res.toArray(new int[intervals.length][]);
        //if overlap mege
        // else update ci
    }
}