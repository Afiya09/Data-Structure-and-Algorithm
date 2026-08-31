package Sorting;
public class InsertionSort{
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int  i =1; i< n ; i++){
            int curr = i;
            int prev = i-1;
            int currVal = arr[curr];
            while(prev>=0 && currVal < arr[prev]){
                arr[prev+1]=arr[prev];
                prev--;
            }

            arr[prev+1] = currVal;

        }
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2,4,6,5};
        insertionSort(arr);
        System.out.println("After Sorting the array: ");
        for(int val : arr){
            System.out.print(val +  " ");
        }
    }
}