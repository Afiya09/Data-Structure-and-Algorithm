package ArrayProblemPart4;
import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target){
        int n = nums.length;
        for(int i=0; i<n-1; i++){
            for(int j = 1; j<n; j++){
                int sum = nums[i] + nums[j];
                if(sum == target){
                    int[] ans = {i,j};
                    return ans;
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
        
    }
    
}
