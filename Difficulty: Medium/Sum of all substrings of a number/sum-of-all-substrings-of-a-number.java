class Solution {
    public static int sumSubstrings(String s) {
        // code here
        int sum=0;
        if(s.length()==0) return 0;
        
        
        int i=0,j=i+1,p=i+2;
        while(j<s.length()) {
            //sum+=Character.getNumericValue(s.charAt(i)+s.substring(i+1,p));   // go gop gopi op op
            sum+=Integer.parseInt(s.substring(i,i+1)+s.substring(i+1,p));
            p++;
            if(p==s.length()+1) {
                sum+=Integer.parseInt(s.substring(i,i+1));
                i++;j++;p=i+2;
                
            }
        }
        sum+=Integer.parseInt(s.substring(i,i+1));
        return sum;
    }
}