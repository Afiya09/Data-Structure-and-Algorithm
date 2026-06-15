/*Take age input and print if he/she is eligible to vote or not */
package Conditions;
import java.util.Scanner;
public class Eligible {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("He/She is eligible to vote");
        }
        else{
            System.out.println("Not eligible to vote");
        }
        sc.close();
    }
    
}
