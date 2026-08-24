/*Create a method add(int A, int B) that return the sum */
package Method;

public class Add {
    public static int add(int A, int B){
        return A+B;
    }
    public static void main(String[] args) {
        int sum=add(10,89);
        System.out.println("The sum of two number is "+ sum);
    }
    
}

//time complexity: O(1)
//space cimplexity: O(1)
