package Day4;
import java.util.Scanner;
public class Factorial {

    public static int findFactorial(int num){
        if(num==1 || num==0){
            return 1;
        }
        return num*findFactorial(num-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int factorial = findFactorial(num);
        System.out.println("The factorial of " + num + " is " + factorial);
        sc.close();
    }
    
}
