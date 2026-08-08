// Find the maximum element in an array
package Arrays;

public class MaximumElement {
    public static int findmax(int arr[]){
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            max = Math.max(max, arr[i]);      
        }
        
        return max;
    }

    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        int max = findmax(arr);
        System.out.println("The maximun element in an array is: " + max);
    }
    
}
