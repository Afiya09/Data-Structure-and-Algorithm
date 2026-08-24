/*Print each character of the String */
package Method;
import java.util.Scanner;

public class Character{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        for(char ch: str.toCharArray()){
            System.out.println(ch);
        }
        sc.close();
    }
}

//time complexity:O(n)

//space complexity:O(n)