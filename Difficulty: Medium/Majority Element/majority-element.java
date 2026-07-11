class Solution {
    int majorityElement(int arr[]) {
        // code here
        int n=arr.length,max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max) max=arr[i];
        }
        int[] array = new int[max];
        for(int i=0;i<n;i++){
            int value = arr[i];
            array[value-1]++;
        }
        for(int i=0;i<max;i++){
            if(array[i]>n/2) return i+1;;
        }
        return -1;
    }
}