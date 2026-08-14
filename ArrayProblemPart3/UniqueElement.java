//Find the unique element in an array
package ArrayProblemPart3;

public class UniqueElement {
    public static int uniqueElement(int[] nums){
        int xorSum = 0;
        for(int n : nums){
            xorSum = xorSum ^ n;
        }
        return xorSum;
    }
    public static void main(String[] args){
        int[] nums = {2,3,5,4,3,4,5};
        System.out.println(uniqueElement(nums));
    }
    
}
