class Solution {
    public boolean isBinaryPalindrome(int n) {
        // code here
        int size = (int)(Math.log(n)/Math.log(2)) +1;
        int[] arr = new int[size];
        int i=0;
        while(n>0){
            if(n==1) {arr[i]=1;break;}
            arr[i]=n%2;
            i++;
            n=n/2;
        }
        int a=0,b=i;
        while(b>a){
            if(arr[a]!=arr[b]) return false;
            a++;b--;
        }
        return true;
    }
}