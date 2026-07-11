class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] arr) {
        // code here
        int row=arr.length,col=arr[0].length;
        int[][] brr = new int[col][row];
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                list1.add(arr[j][i]);
            }
            list2.add(list1);
            list1 = new ArrayList<>();
        }
        //ArrayList<int[][]> result = new ArrayList<>();
        // for(int i=0;i<brr.length;i++){
        //     for(int j=0;j<brr[0].length;j++){
        //         result.add(brr[i][j]);
        //     }
        // }
        //result.add(brr);
        return list2;
    }
}