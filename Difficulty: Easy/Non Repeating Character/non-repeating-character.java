class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        //FREQUENCY ARRAY
        int n=s.length();
        int[] arr = new int[26];
        for(int i=0;i<n;i++){
            int idx = (int)s.charAt(i);
            arr[idx-97]++;
        }
        for(int i=0;i<n;i++) {
            int idx=(int)s.charAt(i);
            if(arr[idx-97]==1) {
                char ch = (char)(idx);
                return ch;
            }
        }
        return '$';
    }
}
