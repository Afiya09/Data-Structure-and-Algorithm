//return the sum of positive and negative number in an array
package Arrays;

public class PosNegSum {
    public static int[] posNegSum(int arr[]){
        int posSum = 0;
        int negSum = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                posSum += arr[i];
            }else{
                negSum  += arr[i];
            }
        }

        return new int[]{posSum, negSum};
    }

    public static void main(String[] args){
        int arr[]={1,2,3,-4,-5};
        int result[] = posNegSum(arr);
        System.out.println("The sum of positive numbers in the array is: " + result[0]);
        System.out.println("The sum of negative numbers in the array is: " + result[1]); 
    }
    
}
