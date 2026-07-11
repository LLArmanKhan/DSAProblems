class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int n=arr.length;
        int[] array= new int[n];
        for(int i=0;i<n;i++){
            array[arr[i]-1]++;
        }
        list.add(0);list.add(0);
        for(int i=0;i<n;i++){
            if(array[i]==2) list.set(0,i+1);  
            if(array[i]==0) list.set(1,i+1);
        }
        return list;
    }
}
