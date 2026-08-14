//Sort an array of 0's and 1's
package ArrayProblemPart3;
import java.util.Arrays;

public class SortArray {
    public static int[] sortArray(int nums[]){
        int n = nums.length;
        int i = 0;
        int j = n-1;
        while(i<j){
            if(nums[i]==1 && nums[j]==0){
            //swap
                nums[i]=0;
                nums[j]=1;
            }
            if(nums[i]==0){
                i++;
            }
            if(nums[j]==1){
                j--;
            }
        }
        return nums;
    }

    public static void main(String[] args){
        int[] nums = {1,0,1,1,0,0,1};
        int[] ans = sortArray(nums);
        System.out.println("After sorting the array: " + Arrays.toString(ans)); 
    }
}
