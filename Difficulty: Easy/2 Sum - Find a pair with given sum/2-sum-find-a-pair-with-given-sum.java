class Solution {
    public List<Integer> twoSum(int arr[], int target) {
        // code here
        ArrayList<Integer> l = new ArrayList<>();
        Arrays.sort(arr);
        int i=0,j=arr.length-1;
        while(j>i){
            if(arr[i]+arr[j]==target) {
                l.add(arr[i]);
                l.add(arr[j]);
                break;
            }
            else if(arr[i]+arr[j]>target) j--;
            else i++;
        }
        return l;
    }
}