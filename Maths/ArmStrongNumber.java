//Armstrong number is a number that is equal to the sum of its own digits raised to the power of the number of digits. For example, 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.
package Maths;
import java.util.Scanner;

public class ArmStrongNumber {
    public static void checkArmstrong(int num){
        int originalNum = num;
        int sum = 0;
        while(num != 0 ){
            int digit = num % 10;
            int cube = digit * digit * digit;
            sum += cube;
            num /= 10; 
        }
        if(sum == originalNum){
            System.out.println("The number " + originalNum  + " is a Armstrong number");
        }
        else{
            System.out.println("The number " + originalNum  + " is not an Armstrong number");
        }
        
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is an Armstrong number: ");
        int num = sc.nextInt();
        checkArmstrong(num);
        sc.close();
    }
}
