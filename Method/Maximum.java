/*Create a method getmaximun(int A, int B) that returns the larger number */
package Method;


public class Maximum{
    public static int getMaximum(int A, int B){
        return(Math.max( A, B));

    }

    public static void main(String[] args) {
       System.out.println(getMaximum(25, 890)); 
    }
}

//time complexity: O(1)
//space complexity: O(1)