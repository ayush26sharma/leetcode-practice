class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        arr1.add(1);
        arr2.add(1); arr2.add(1);
        arr.add(arr1); 
        if (numRows>1) arr.add(arr2);
        for (int i = 3; i<=numRows; i++){
            List<Integer> array = new ArrayList<>();
            array.add(1);
            for(int j = 1; j<i-1; j++){
                array.add(arr.get(i-2).get(j)+arr.get(i-2).get(j-1));
            }
            array.add(1);
            arr.add(array);
        }
        return arr;
    }
}