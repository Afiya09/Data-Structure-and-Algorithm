package Loops;
import java.util.Scanner;
public class ReverseCounting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        for(int i = n; i > 0; i--){
            System.out.println(i);
        }
        sc.close();

    }
    
}
