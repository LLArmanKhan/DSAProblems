class Solution {
    public ArrayList<Integer> getAlternates(int arr[]) {
        // Code Here
        ArrayList<Integer> array = new ArrayList<>();
        for(int i=0;i<arr.length;i+=2) {
            array.add(arr[i]);
        }
        return array;
    }
}