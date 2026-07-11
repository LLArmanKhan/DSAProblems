class Solution {
    void selectionSort(int[] arr) {
        // code here
        int min=Integer.MAX_VALUE,minidx=-1,n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i;j<n;j++){
                if(arr[j]<min) {min=arr[j];minidx=j;}
            }
            int temp=arr[minidx];
            arr[minidx]=arr[i];
            arr[i]=temp;
            min=Integer.MAX_VALUE;
        }
    }
}