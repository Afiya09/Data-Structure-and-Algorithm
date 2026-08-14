package ArrayProblemPart4;

public class FirstPivotIndex {
    public static int pivotIndex(int[] nums){
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        //left sum
        leftSum[0] = nums[0];
        for(int i =1; i<n; i++){
            leftSum[i] = leftSum[i-1]+nums[i];
        }
        //right sum
        rightSum[n-1] = nums[n-1];
        for(int i = n-2; i>=0 ; i--){
            rightSum[i] = rightSum[i+1]+nums[i];
        }

        //comparison
        for(int i = 0; i<n ; i++){
            if(leftSum[i]==rightSum[i]){
                return i;
            }
        }
        return -1;

   }

   public static void main(String[] args){
    int[] nums = {12,19,2,-20,6,14,-1};
    System.out.println(pivotIndex(nums));
   }
    
}
