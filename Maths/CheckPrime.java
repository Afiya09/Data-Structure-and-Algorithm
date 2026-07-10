// check prime number
package Maths;
import java.util.Scanner;

public class CheckPrime {
    public static void checkPrime(int num){
        if(num <= 1){
            System.out.println(num + " is not a prime number");
            return;
        }
        else{
            for(int i=2; i*i<=num; i++){
                if(num % i ==0){
                    System.out.println(num + " is not a prime  number");
                    return;
                }
            }
            System.out.println(num + " is a prime number");
        }

    }

    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime: ");
        int num = sc.nextInt();
        checkPrime(num);
        sc.close();
    }
    
}
