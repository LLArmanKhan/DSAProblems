class Solution {
    public void rotateMatrix(int[][] arr) {
        // code here
        int row=arr.length;
        
        //TRANSPOSE
        for(int i=0;i<row;i++){
            for(int j=i+1;j<row;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        
        for(int i=0;i<row/2;i++){
            for(int j=0;j<row;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[row-1-i][j];
                arr[row-1-i][j]=temp;
            }
        }
    }
}