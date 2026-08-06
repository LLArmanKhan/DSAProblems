class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashSet<Integer> set=new HashSet<>();
        set.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            int pair=target-arr[i];
            if(set.remove(pair))
                return true;
            else
                set.add(arr[i]);
        }
        return false;
    }
}