package Sorting;
import java.util.*;

public class MergeSort {
    public static void merge(int[] arr, int start, int mid , int end){
        int[] temp = new int[end-start+1];
        int x = start;
        int y = mid+1;
        int k=0;
        while(x<=mid && y<=end){
            if(arr[x]<arr[y]){
                temp[k++] = arr[x++];
            }
            else{
                temp[k++]= arr[y++];
            }

        }
        while(x<=mid){
            temp[k++] = arr[x++];
        }

        while(y<=end){
            temp[k++]= arr[y++];
        }

        //copy merged result back into original array
        for(int i =0; i<temp.length; i++){
            arr[start+i] = temp[i];
        } 
    }

    public static void mergeSort(int[] arr, int start, int end){
        if(start >=end){
            return;
        }
        int mid = (start + end)/2;
        mergeSort( arr, start, mid);
        mergeSort( arr, mid+1, end);
        merge(arr, start, mid, end);
    }

    public static void main(String[] args) {
        int arr[] = {8,3,5,4,7,6,1,2};
        int start = 0;
        int end = arr.length - 1;
        mergeSort(arr,start,end);
        System.out.println(Arrays.toString(arr));
        
    }
    
}
