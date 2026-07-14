class Solution {
    int factorial(int n) {
        // code here
        if(n==0) return 1;
        return revfact(1,n);
    }
    int revfact(int a,int n){
        if(a==n) return n;
        return a*revfact(a+1,n);
    }
}
