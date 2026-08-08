//Find first unsorted element in array
package Arrays;

public class unsortedelement {
    public static int findUnsortedElement(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                return arr[i+1];
            }
        }
        return -1; // Return -1 if the array is sorted
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,5,4,6};
        int unsortedElement = findUnsortedElement(arr);
        if(unsortedElement != -1){
            System.out.println("The first unsorted element in the array is: " + unsortedElement);
        } else {
            System.out.println("The array is sorted.");
        }
    }
}
