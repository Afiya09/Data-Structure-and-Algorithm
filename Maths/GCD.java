//Greatest Common Divisor of a number
package Maths;
import java.util.Scanner;

public class GCD {
    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b, a%b);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to find their GCD: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = gcd(a,b);
        System.out.println("GCD of " +  a + " and " + b + " is " + result );
        sc.close();

    }
    
}
