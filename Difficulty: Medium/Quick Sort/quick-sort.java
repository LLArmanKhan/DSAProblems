class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low>=high) return;
        int pivotidx=partition(arr,low,high);
        quickSort(arr,low,pivotidx-1);
        quickSort(arr,pivotidx,high);
    }

    private int partition(int[] arr, int low, int high) {
        // code here
        int pivot=arr[(high+low)/2];
        while(low<=high){
            while(arr[low]<pivot)
                low++;
            while(arr[high]>pivot)
                high--;
            if(high>=low){
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
            }
        }
        return low;
    }
}