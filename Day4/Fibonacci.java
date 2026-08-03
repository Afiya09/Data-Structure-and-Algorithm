package Day4;
import java.util.Scanner;

public class Fibonacci {
    public static int fibonacciSeries(int a, int b, int n){
        if(n==0){
            return a;
        }
        System.out.print(a + " " );
        return fibonacciSeries(b, a+b, n-1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        fibonacciSeries(0, 1, n);
        
        sc.close();
    }

    
    
}
