package BitwiseOperator;
import java.util.Scanner;
public class Divideby2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int result = num >> 1;
        System.out.println("The result of dividing " + num + " by 2 is : " + result);
        sc.close();
    }
    
}
