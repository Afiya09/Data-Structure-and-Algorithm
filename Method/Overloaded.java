/*Create an overloaded method display() with one int parameter or two string parameter */
package Method;

public class Overloaded {
    public static void display(int num){
        System.out.println("The number is "+num);
    }

    public static void display(String Firstname, String Lastname){
        System.out.println("FullName: "+Firstname + Lastname);
    }

    public static void main(String[] args) {
        display(10);
        display("Afiya", "Siddiqui");
    }
    
}

//time complexity: O(1)
//space complexity: O(1)
