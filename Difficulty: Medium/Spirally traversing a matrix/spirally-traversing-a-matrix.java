class Solution {
    public ArrayList<Integer> spirallyTraverse(int[][] arr) {
        // code here
        int n=arr.length,m=arr[0].length;
        ArrayList<Integer> list = new ArrayList<>();
        int firstrow=0,lastrow=n-1,firstcol=0,lastcol=m-1;
        int count=0,tne=n*m;
        while(count<tne){
            for(int i=firstcol;i<=lastcol;i++){
                list.add(arr[firstrow][i]);
                count++;
            }
            if(count==tne) break;
            firstrow++;
            for(int i=firstrow;i<=lastrow;i++){
                list.add(arr[i][lastcol]);
                count++;
            }
            if(count==tne) break;
            lastcol--;
            for(int i=lastcol;i>=firstcol;i--){
                list.add(arr[lastrow][i]);
                count++;
            }
            if(count==tne) break;
            lastrow--;
            for(int i=lastrow;i>=firstrow;i--){
                list.add(arr[i][firstcol]);
                count++;
            }
            if(count==tne) break;
            firstcol++;
        }
        return list;
    }
}
