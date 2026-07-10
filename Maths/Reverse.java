//Reverse a  number
package Maths;
import java.util.Scanner;

public class Reverse {
    public static void reverseNumber(int num){
        int rev = 0;
        while(num != 0){
            int remainder = num % 10;
            rev = rev*10 + remainder;
            num /= 10;
        }
        System.out.println("Reversed Number: " + rev);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse: ");
        int num = sc.nextInt();
        reverseNumber(num);
        sc.close();
    }
    
}
