package BinarySearch;

public class BinarySearch {
    public static int binarySearch(int[] nums , int target){
        int n = nums.length;
        int start = 0;
        int end = n-1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(nums[mid] == target){
                return mid;
            }

            else if(target > nums[mid]){
                start = mid+1;
            }

            else{
                end = mid-1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50,60};
        int target = 30;
        System.out.println(binarySearch(nums, target));
    }
    
}

//time complexity-O(logn)
//space complexity-O(1)
