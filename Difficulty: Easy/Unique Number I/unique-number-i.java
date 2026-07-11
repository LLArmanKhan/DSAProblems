class Solution {
    public int findUnique(int[] arr) {
        // code here
        int ele=0;
        for(int i=0;i<arr.length;i++)
            ele=ele^arr[i];
        return ele;
    }
}