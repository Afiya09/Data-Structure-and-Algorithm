// Search for an element in an array
package Arrays;

public class SearchElement {
    public static boolean findTarget(int arr[], int target){
        for(int i=0; i< arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        int target = 3;
        if(findTarget(arr, target)){
            System.out.println("The target element " + target + " is found in the array. ");
        } else {
            System.out.println("The target element " + target + " is not found in the array. ");
        }
    }
    
}
