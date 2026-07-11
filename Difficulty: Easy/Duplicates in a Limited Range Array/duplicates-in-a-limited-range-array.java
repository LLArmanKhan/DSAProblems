class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int n=arr.length;
        int[] check = new int[n];
        for(int i=0;i<n;i++){
            int value = arr[i];
            check[value-1]++;
        }
        for(int i=0;i<n;i++){
            if(check[i]==2) list.add(i+1);
        }    
        return list;
    }
}