package Sorting;

public class SelectionSort {
    public static void selectionSort(int arr[]){
        //outer loop for round
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int minIndex = i;
            for(int j=i+1 ; j<n; j++ ){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp ;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,3,2,4,1};
        selectionSort(arr);
        System.out.println("After the sorting: ");
        for(int val :  arr){
            System.out.print(val + " ");
        }
        
    }
    
}

//time complexity: O(n^2)
//space Complexity: O(1)
