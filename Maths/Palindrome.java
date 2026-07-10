// palindrome number

package Maths;
import java.util.Scanner;

public class Palindrome {
    public static void checkPalindrome(int num){
        int originalNum = num;
        int rev = 0;
        while(num != 0){
            int remainder = num % 10;
            rev = rev*10 + remainder;
            num /= 10;
        }
        if(originalNum == rev){
            System.out.println("The number " + originalNum + " is a palindrome");
        }else{
            System.out.println("The number " + originalNum + " is not a palindrome");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a palindrome: ");
        int num = sc.nextInt();
        checkPalindrome(num);
        sc.close();
    }
    
}
