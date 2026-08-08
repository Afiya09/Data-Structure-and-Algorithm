//Multiply each element of an array by 10
package Arrays;

public class Multiplyby10 {
    public static void multiplyBy10(int arr[]){
        for(int i=0; i<arr.length; i++){
            arr[i] *= 10;
        }
        System.out.println("The array elements after multiplying by 10 are: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        multiplyBy10(arr);
    }
    
}
