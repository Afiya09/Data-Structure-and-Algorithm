// LCM of two numbers
//LCM= (a*b)/gcd(a,b)
package Maths;
import java.util.Scanner;

public class LCM {
    public static int gcd(int a, int b){
        
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }

    public static int lcm(int a, int b){
        int product = a*b;
        int gcdValue = gcd(a,b);
        return product/gcdValue;
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers to find their LCM: ");
        int a = sc.nextInt();       
        int b = sc.nextInt();
        int result = lcm(a,b);
        System.out.println("LCM of " + a + " and " + b + " is " + result);
        sc.close(); 
    }
}
