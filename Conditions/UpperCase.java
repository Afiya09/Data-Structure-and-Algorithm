/*Take input a uppercase character and print its lower version */

package Conditions;
import java.util.Scanner;
public class UpperCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Uppercase Character: ");
        char ch = sc.next().charAt(0);
        System.out.println(Character.toLowerCase(ch));
        sc.close();
    }
    
}
