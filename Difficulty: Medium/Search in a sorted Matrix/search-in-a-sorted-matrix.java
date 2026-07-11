class Solution {
    public boolean searchMatrix(int[][] arr, int x) {
        // code here
        int rows=arr.length , cols=arr[0].length;   
        
        // since here there is arrays inside array therefore no of rows=no of subarray
        // no of columns will be the length of any subarray
        
        int low=0,high=rows*cols-1;
        while(high>=low) {
            int mid=low+(high-low)/2;
            int rowno=mid/cols,colno=mid%cols;     // a%b==a-b*(a/b)
            if(arr[rowno][colno]==x) return true;
            else if(arr[rowno][colno]>x) high=mid-1;
            else low=mid+1;
        }
        return false;
    }
}
