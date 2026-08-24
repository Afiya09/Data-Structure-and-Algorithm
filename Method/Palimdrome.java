/*Check String is palindrome or not */

package Method;
import java.util.Scanner;

public class Palimdrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        String reverse = "";
        for(int i=str.length()-1; i>=0; i--){
            reverse+=str.charAt(i);
        }
        if(str.equals(reverse)){
            System.out.println("The String is palindrome");
        }
        else{
            System.out.println("The String is not palindrome");
        }
        sc.close();
    }
}

//time complexity: O(n^2)
//space complexity: O(n)
