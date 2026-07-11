class Solution {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        // Your code here
        ArrayList<Integer> arr = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0,j=0;
        while(i<a.length && j<b.length){
            if((a[i]^b[j])==0) {
                arr.add(a[i]);
                i++;j++;
            }
            else if(a[i]>b[j]) j++;
            else i++;
        }
        return arr;
    }
}