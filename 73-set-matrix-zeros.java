class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[] rowhaszero = new boolean[matrix.length];
        boolean[] colhaszero = new boolean[matrix[0].length];

        for( int i=0 ; i < rowhaszero.length;i++){
            for(int j =0 ; j < colhaszero.length;j++){
                if(matrix[i][j]==0){
                    rowhaszero[i]=true;
                    colhaszero[j]=true;
                }
            }
        }
        for( int i =0 ; i < rowhaszero.length ; i++){
            for(int j =0 ; j < colhaszero.length ; j++){
                if(rowhaszero[i]|| colhaszero[j]){
                    matrix[i][j]=0;
                    
                }
            }
        }
    }
}