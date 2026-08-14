//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
package ArrayProblemPart3;

public class MissingNumber {
    public static int missingNumber(int[] nums){
        int xorSum = 0;
        for(int n: nums){
            xorSum = xorSum ^ n;
        }

        int n = nums.length;
        for(int i=0; i<=n; i++){
            xorSum = xorSum ^ i;
        }

        return xorSum;
    }

    public static void main(String[] args){
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums)); 
    }
    
}
