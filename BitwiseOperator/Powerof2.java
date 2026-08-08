package BitwiseOperator;
import java.util.Scanner;
public class Powerof2 {

    //(n & (n-1)) == 0 is true if n is a power of 2
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if((num & (num-1))== 0 ){
            System.out.println("The number " + num + " is a power of 2.");
        }
        else{
            System.out.println("The number " + num + " is not a power of 2.");
        }
        sc.close();
    }
    
}
