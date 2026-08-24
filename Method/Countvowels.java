/*Count vowels in a string */

package Method;
import java.util.Scanner;
public class Countvowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        int count=0;
        int n = str.length();
        for(int i=0; i<n; i++){
            char ch = str.toLowerCase().charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println("Number of voewl:  "+ count);
        sc.close();
    }

    
}

//time complexity: O(n^2)
//space complexity: O(n)
