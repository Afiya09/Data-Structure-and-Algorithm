//Count the number of 0;s and 1's in an array
package Arrays;

public class CountZeroandOnes {
    public static int[] countZeroandOnes(int arr[]){
        int count0 = 0;
        int count1 = 0;
        for(int i=0; i<arr.length; i++){
            if (arr[i] == 0){
                count0++;
            }
            else{
                count1 ++;
            }
        }
        return new int[]{count0, count1};
    }

    public static void main(String[] args){
        int arr[] = {0,1,0,1,1,0,1};
        int result[] = countZeroandOnes(arr);
        System.out.println("The number of 0's in the array is: " + result[0]);
        System.out.println("The number of 1's in the array is: " + result[1]);
    }
    
}
