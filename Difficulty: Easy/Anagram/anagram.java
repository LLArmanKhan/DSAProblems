class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        int n=s1.length(),m=s2.length();
        if(n!=m) return false;
        char[] a1=s1.toCharArray();
        char[] a2=s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        for(int i=0;i<n;i++) {
            if(a1[i]!=a2[i]) return false;
        }
        return true;
    }
}