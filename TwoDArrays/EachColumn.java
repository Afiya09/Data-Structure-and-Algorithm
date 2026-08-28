//Print the sum of each column in 2D Array
//Input - [[1,2,3],
//         [4,5,6],
//         [7,8,9]]
//output - [12,15,18]

package TwoDArrays;
import java.util.*;
public class EachColumn {
    public static List<Integer> colSum(int[][] arr){
        List<Integer> result = new ArrayList<>();
        int row = arr.length;
        int col = arr[0].length;

        //col traversal
        for(int j = 0; j<col;j++){
            int sum = 0;
            for(int i = 0; i< row;i++){
                int val = arr[i][j];
                sum += val;
            }
            result.add(sum);
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(colSum(arr));

    }
    
}

//time complexity-O(m*n)
//space complexity-O(column)
