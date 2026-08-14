//Remove duplicates from sorted arrays
package ArrayProblemPart4;

public class RemoveDuplicates{
    public static int removeDuplicates(int[] nums){
        int i = 0;
        int j =1;
        int n = nums.length;
        while(j<n){
            if (nums[i]==nums[j]){
                j++;
            }
            else{
                i++;
                nums[i]=nums[j];
                j++;
            }
        }
        return i+1;
    }

    public static void main(String[] args){
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }
}