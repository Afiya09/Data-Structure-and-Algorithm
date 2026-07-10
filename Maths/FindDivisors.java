//Find divisor or check perfect number
package Maths;
import java.util.Scanner;
public class FindDivisors {
    public static void findDvivisors(int num){
        int originalNum = num;
        int sum = 1;
        for(int i=2; i*i<=num; i++){
            if(num%i == 0){
                int firstdivisor = i;
                int seconddivisor = num/i;
                sum += firstdivisor + seconddivisor;
            }
        }

        if(sum == originalNum){
            System.out.println("The number " + originalNum  + " is a perfect number");
        }
        else{
            System.out.println("The number " + originalNum  + " is not a perfect number");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a perfect number: ");
        int num = sc.nextInt();
        findDvivisors(num);
        sc.close();
    }
    
}
