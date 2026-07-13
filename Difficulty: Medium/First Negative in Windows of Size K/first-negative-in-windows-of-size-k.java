class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // code here
        int n=arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> neg = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(arr[i]<0) neg.add(i);
        }
        for(int j=0;j<n-k+1;j++){
            while(neg.size()>0 && neg.peek()<j) neg.remove();
            if(neg.size()>0 && neg.peek()<j+k) ans.add(arr[neg.peek()]);
            else ans.add(0);
        }
        return ans;
    }
}