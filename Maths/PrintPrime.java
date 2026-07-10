//Print prime numbers between 1 to n
package Maths;
import java.util.Scanner;
public class PrintPrime {
    public static void printAllPrime(int n){
        for(int num = 2; num<=n; num++){
            boolean isPrime = checkPrime(num);
            if(isPrime == true){
                System.out.print(num + " ");
            }
        }
    }

    public static boolean checkPrime(int num){
        if(num <=1){
            return false;
        }
        for(int i=2; i*i<=num; i++){
            if(num % i == 0 ){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print all prime numbers between 1 to n: ");
        int n = sc.nextInt();
        printAllPrime(n);
        sc.close();
    }

    
}
