//Transpose of a matrix
package TwoDArrays;
import java.util.*;

public class Transpose {
    public static int[][] Matrixtranspose(int[][] arr){
        if(arr==null || arr.length== 0 ){
            return new int[0][0];
        }
        int row = arr.length;
        int col = arr[0].length;
        //for new array
        int newrow = col;
        int newcol = row;
        int[][] nums = new int[newrow][newcol];
        for(int i =0 ;i<newrow; i++){
            for(int j = 0; j<newcol; j++){
                nums[i][j]= arr[j][i];
            }
        }
        return nums;
        
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(Matrixtranspose(arr)));
    }
    
}

//time complexity - O(row*col)

//space complexity - O(row*col)
