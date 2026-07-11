class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int i=0,j=arr.length-1;
        while(j>i) {
            if(arr[i]==0) i++;
            else if(arr[j]==1) j--;
            else if(arr[i]==1 && arr[j]==0) {
                arr[i]=0;arr[j]=1;
                i++;j--;
            }
        }
    }
}
