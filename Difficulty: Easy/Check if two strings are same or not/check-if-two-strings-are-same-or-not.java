class Solution {
    public static boolean areStringsSame(String s1, String s2) {
        // code here
        int n1=s1.length(),n2=s2.length();
        if(n1!=n2) return false;
        int[] arr1=new int[127];
        int[] arr2=new int[127];
        for(int i=0;i<n1;i++) {
            int a=(int)s1.charAt(i);
            int b=(int)s2.charAt(i);
            arr1[a]++;arr2[b]++;
        }
        for(int i=0;i<127;i++) {
            if(arr1[i]!=arr2[i]) return false;
        }
        return true;
    }
}