class Solution {
    static boolean cond(int[] array){
        int n=array.length;
        for(int i=0;i<n-1;i++){
            if(array[i]<array[i+1]) return false;
        }
        return true;
    }
    
    static int[] maxele(int start,int[] array){
        
        int max=Integer.MIN_VALUE,n=array.length;
        int idx=-1;
        
        for(int i=start;i<n;i++){
            if(array[i]>max) {max=array[i];idx=i;}
        }
        int[] list = new int[2];
        list[0]=idx;list[1]=max;
        return list;
    }
    
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int n=arr.length;
        if(cond(arr)==true){
            for(int i=0;i<n;i++){
                result.add(arr[i]);
            }
        }
        else{
            int value=maxele(0,arr)[1];
            int index=maxele(0,arr)[0];
            while(index<n-1){
                result.add(value);
                value=maxele(index+1,arr)[1];
                index=maxele(index+1,arr)[0];
            }
            result.add(arr[n-1]);
        }
        return result;
    }
}
