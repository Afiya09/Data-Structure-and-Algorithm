//Wave Print a Matrix
package TwoDArrays;
import java.util.*;

public class WaveMatrix {
    public static List<Integer> waveMatrix(int[][] arr, int m , int n){
        //m-length of row
        //n-length of column
        List<Integer> result = new ArrayList<>();
        for(int col =0; col < n;col++){
            //if col is even  -top to bottom
            //if col is odd - bottom to up
            if( (col & 1)== 1){
                //odd
                for(int row = m-1 ; row >=0; row--){
                    result.add(arr[row][col]);
                }
            }
            else{
                for(int row = 0; row<m ; row++){
                    result.add(arr[row][col]);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int m = 1;
        int n = 5;
        int[][] arr = {{1,2,3,4,5}};
        System.out.println(waveMatrix(arr, m, n));

    }

}
//time complexity  - O(m*n)
//space complexity  - O(m*n)