/*Complete the function below*/
class Solution {
    public int findExtra(int a[], int b[]) {
        // add code here.
        int ele=0,temp=0;
        for(int i=0;i<b.length;i++){
            temp=a[i]^b[i];
            ele=ele^temp;
        }
        ele=ele^a[a.length-1];
        for(int i=0;i<a.length;i++)
            if(a[i]==ele) return i;
        return -1;
    }
}