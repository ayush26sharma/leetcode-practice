class Solution {
    public List<Integer> findLonely(int[] arr) {
        ArrayList<Integer> al=new ArrayList<>();
        Arrays.sort(arr);
        if(arr.length==1){
            al.add(arr[0]);
            return al;
        }
        if(arr[0]+1!=arr[1]&&arr[0]!=arr[1])al.add(arr[0]);
        if(arr[arr.length-1]-1!=arr[arr.length-2]&&arr[arr.length-1]!=arr[arr.length-2])al.add(arr[arr.length-1]);
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]==arr[i-1]||arr[i]==arr[i+1])continue;
            else if(arr[i-1]+1!=arr[i]&&arr[i+1]-1!=arr[i])al.add(arr[i]);
        }
        return al;
    }
}