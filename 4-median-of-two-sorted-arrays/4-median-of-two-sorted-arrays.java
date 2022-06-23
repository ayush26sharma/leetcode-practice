class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int i=0; int j=0; int k=0;
        int[] arr=new int[arr1.length + arr2.length];
        while(i < arr1.length && j < arr2.length){
            if (arr1[i] < arr2[j]){
                arr[k] = arr1[i];
                i++; k++;
            }
            else{
                arr[k] = arr2[j];
                j++; k++;
            }
        }
        while (i < arr1.length) {
            arr[k] = arr1[i];
            i++; k++;
        }
        while (j < arr2.length){
            arr[k] = arr2[j];
            j++; k++;
        }
        if (arr.length%2==1){
            double x = arr[(arr.length-1)/2];
            return x;
        }
        else{
            double x = arr[(arr.length)/2];
            double y = arr[((arr.length)/2) -1];
            double c = (x+y)/2;
            return c;
        }
    }
}