package Sorting;

public class BubbleSort {
    public static void bubbleSort(int[] nums){
        int n = nums.length;
        for(int i = 0 ;  i< n-1; i++){
            for(int j = 0; j< n-1-i; j++){
                if(nums[j]> nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] =temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {5,3,6,1};
        bubbleSort(nums);
        System.out.println("After the bubble sort " );
        for(int val: nums){
            System.out.println(val);
        }
    }
    
}

//time complexity: O(n^2)
//space complexity: O(1)
