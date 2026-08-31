package Sorting;
import java.util.*;
public class QuickSort {
    public static void quickSort(int[] arr, int start, int end){
        if(start >=end){
            return;//0 or 1 element is already sorted
        }
        int pivotIndex = partition(arr, start, end);
        quickSort(arr, start, pivotIndex-1);
        quickSort(arr , pivotIndex+1, end);
    }

    public static int partition(int[] arr, int start, int end){
        int pivot = arr[end];// choose last element as pivot
        int i = start -1 ;
        for(int j = start; j<end; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        //place pivot right after the smaller region
        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;

        return i+1;
    }

    public static void main(String[] args) {
        int[] arr = {8,3,5,4,7,6,1,2};
        quickSort(arr, 0 , arr.length-1);
        System.out.println(Arrays.toString(arr)); 
    }
}
