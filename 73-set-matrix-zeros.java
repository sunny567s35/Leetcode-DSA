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

//SOlution -2 - Optimal 

class Solution {
    public void setZeroes(int[][] matrix) {
        int col0=1;
        for(int i =0 ; i < matrix.length ;i++){
            for(int j =0 ; j < matrix[0].length;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                   if(j!=0){matrix[0][j]=0;}
                   else{col0=0;}
                }
            }
        }
        for(int i =1; i < matrix.length ;i++){
            for(int j =1 ; j < matrix[0].length;j++){
                if(matrix[i][j]!=0){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
                }
            }
        }
          if(matrix[0][0]==0){
            for(int i =0 ; i < matrix[0].length ; i++){
                matrix[0][i]=0;
            }
        }
        
        if(col0 ==0 ){
            for(int i =0 ; i < matrix.length ; i++){
                matrix[i][0]=0;
            }
        }
      
    }
}