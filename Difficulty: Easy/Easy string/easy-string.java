class Solution {
    String transform(String s) {
        // code here
        int i=0,j=0,n=s.length(),idx=0;
        int[] arr=new int[n];
        while(j<n) {
            if(s.charAt(i)==s.charAt(j) || (int)s.charAt(i)==((int)(s.charAt(j))+32) || (int)s.charAt(i)==((int)(s.charAt(j)-32))) j++;
            else {
                arr[idx]=j-i;
                i=j;
                idx++;
            }
        }
        arr[idx]=j-i;
        StringBuilder sb = new StringBuilder();
        int temp=0,sidx=0;
        while(sidx<n) {
            sb.append(arr[temp]);temp++;
            sb.append(Character.toLowerCase(s.charAt(sidx)));sidx+=arr[temp-1];
            
        }
        return sb.toString();
    }
}