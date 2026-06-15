/*Take input a lowercase character and print its uppercase version */

package Conditions;
import java.util.Scanner;
public class Lowercase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a lowercase character: ");
        char ch = sc.next().charAt(0);
        System.out.println(Character.toUpperCase(ch));
        sc.close();

    }
    
}
