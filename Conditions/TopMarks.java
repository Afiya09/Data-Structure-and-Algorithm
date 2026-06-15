/*Take input 5 subjects marks, drop the least one and calculate the overall percentage considering only the top 4 marks , print it */
package Conditions;
import java.util.Scanner;
import java.util.Arrays;

public class TopMarks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];

        for(int i=0; i<5; i++){
            marks[i] = sc.nextInt();
        }

        Arrays.sort(marks);
        int sum = 0;
        for(int i = 1; i<5; i++){
            sum += marks[i];
        }

        double percentage = (sum/400.0)*100;
        System.out.println("The overall percentage is "+percentage);
        sc.close();
    }
    
}
