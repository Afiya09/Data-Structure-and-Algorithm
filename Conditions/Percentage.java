/*Take input 5 subjects marks and print the overall percentage of students */
package Conditions;
import java.util.Scanner;
public class Percentage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        for(int i=0; i<5; i++){
            marks[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i=0; i<5; i++){
            sum+=marks[i];
        }
        double percentage = (sum/500.0)*100.0;
        System.out.println("The overall percentage of subjects: "+percentage);
        sc.close();


    }
}
