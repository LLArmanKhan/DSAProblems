class Solution {
    public boolean isBinary(String s) {
        // code here
        int n=s.length();
        for(int i=0;i<n;i++) {
            if(s.charAt(i)!='0' && s.charAt(i)!='1') return false;
        }
        return true;
    }
}