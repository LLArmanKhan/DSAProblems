class Solution {
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        // code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
            for(int j=0;j<i+1;j++){
                if(j==0 || j==i) list.get(i).add(1);
                else{
                   int value=list.get(i-1).get(j-1)+list.get(i-1).get(j);    
                    list.get(i).add(value);
                }
            }
        }
        return list.get(n-1);
    }
}