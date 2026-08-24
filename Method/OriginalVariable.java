/*Write a method updateValue(int X) and verify that original variable in main() does not change */
package Method;

public class OriginalVariable {
    public static int updateValue(int X){
        return X;
    }
    public static void main(String[] args) {
        int X= 22;
        System.out.println("the original value : : "+X);
        System.out.println("The updated value: "+updateValue(10));
    }
    
}

//time complexity: O(1)
//space complexity: O(1)