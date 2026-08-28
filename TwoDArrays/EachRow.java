// Print the sum of Each Row in a 2D Array
//Input - [[1,2,3],[4,5,6],[7,8,9]]
//Output- [6,15,24]
package TwoDArrays;
import java.util.ArrayList;
import java.util.List;
class EachRow{
    public static List<Integer> rowSums(int[][] arr){
        List<Integer> result = new ArrayList<>();
        int row = arr.length;
        int col = arr[0].length;
        //row
        for(int i = 0; i < row; i++ ){
            int sum=0;
            for(int j = 0 ; j< col; j++){
                int val = arr[i][j];
                sum += val;
            }
            result.add(sum);

        }
        return result;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(rowSums(arr));

        
    }
}

//time complexity - O(row*col)
//space complexity - O(row)