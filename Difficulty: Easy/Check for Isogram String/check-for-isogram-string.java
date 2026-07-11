

class Solution {
    // Function to check if a string is Isogram or not.
    static boolean isIsogram(String s) {
        // Your code here
        int n=s.length();
        int[] arr=new int[26];
        for(int i=0;i<n;i++){
            int idx=(int)s.charAt(i);
            arr[idx-97]++;
        }
        for(int i=0;i<26;i++){
            if(arr[i]>1) return false;
        }
        return true;
    }
}