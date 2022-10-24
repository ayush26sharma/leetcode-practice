package com.company;
import java.util.*;
import java.math.*;
public class Sorts {
    static class QuickSort{
        static int partition(int[] arr, int l, int h) {
            int pivot = arr[h];
            int i = l - 1;
            for(int j = l; j <= h - 1; j++) {
                if (arr[j] < pivot) {
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            int temp = arr[i+1];
            arr[i+1] = arr[h];
            arr[h] = temp;
            return i+1;
        }
        static void quickSort(int[] arr, int l, int h) {
            if (l < h) {
                int partitionIndex = partition(arr, l, h);
                quickSort(arr, l, partitionIndex - 1);
                quickSort(arr, partitionIndex + 1, h);
            }
        }
    }
    static class MergeSort{
        public static int[] zipArrays(int[]arr1 ,int[]arr2){
            int i=0; int j=0; int k=0;
            int[] arr=new int[arr1.length + arr2.length];
            while(i < arr1.length && j< arr2.length){
                if (k%2 == 0){
                    arr[k] = arr1[i];
                    i++; k++;
                }
                else{
                    arr[k] = arr2[j];
                    j++; k++;
                }
            }
            while(i < arr1.length){
                arr[k]=arr1[i];
                i++; k++;
            }
            while(j < arr2.length){
                arr[k]=arr2[j];
                j++; k++;
            }
            return arr;
        }
        public static int[] mergeSortedArrays(int[] arr1,int[] arr2){
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
            return arr;
        }
        public static int[] mergesort(int[] arr,int l,int h){
            if(l==h){
                return arr;
            }
            int mid=(l+h)/2;
            int[] arr1 = mergesort(arr,l,mid);
            int[] arr2 = mergesort(arr,mid+1,h);
            return mergeSortedArrays(arr1,arr2);
        }
        static void merge(int arr[], int l, int mid, int h) {
            int l2 = mid + 1;
            if (arr[mid] <= arr[l2]) {
                return;
            }
            while (l <= mid && l2 <= h) {
                if (arr[l] <= arr[l2]) {
                    l++;
                }
                else {
                    int value = arr[l2];
                    int k = l2;
                    while (k != l) {
                        arr[k] = arr[k - 1];
                        k--;
                    }
                    arr[l] = value;
                    l++; mid++; l2++;
                }
            }
        }
        static void mergeSort(int arr[], int l, int h) {
            if (l < h) {
                int m = (l + h)/ 2;
                mergeSort(arr, l, m);
                mergeSort(arr, m + 1, h);
                merge(arr, l, m, h);
            }
        }
    }
    static int fun1(int n){
        if (n==1){
            return 0;
        }
        return 1 + fun1(n/2) + fun1(n/2);
    }

    public static void main(String[] args) {
//        int[] a = {1,2,3,4,5,6};
//        int[] b = {9,8,7,6,5,4};
//        int[] c = MergeSort.zipArrays(a,b);
//        for (int i = 0; i < c.length; i++) {
//            System.out.print(c[i] + " ");
//        }
          int arr[] = {10, 7, 8, 9, 1, 5};
          Arrays.stream(arr).max();

//        int n = arr.length;
//        System.out.println();
//        QuickSort.quickSort(arr, 0, n-1);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
        System.out.println(fun1(71));

    }
}
