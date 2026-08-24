/*Count length of string without length( ) */

package Method;

import java.util.Scanner;

public class Countlength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String" );
        String str = sc.nextLine();
        int count = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            count++;
        }
        System.out.println(count);
        sc.close();
    }
    
}

//time complexity: O(n)
//space complexity: O(n)