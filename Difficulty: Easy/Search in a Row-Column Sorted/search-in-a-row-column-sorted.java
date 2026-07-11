class Solution {
    public static boolean matSearch(int arr[][], int x) {
        // code here
        int n=arr.length,m=arr[0].length;
        int i=0,j=m-1;
        while(i<n && j>=0){
            if(arr[i][j]>x) j--;
            else if(arr[i][j]<x) i++;
            else return true;
        }
        return false;
    }
}