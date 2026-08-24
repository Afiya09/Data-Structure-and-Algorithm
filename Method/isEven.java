/*Create a method isEven(int number) that returns true if Number is even */
package Method;

public class isEven {
    public static boolean IsEven(int Number){
        if(Number%2==0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(IsEven(56));
    }
    
}

//time complexity: O(1)
//space complexity: O(1)
