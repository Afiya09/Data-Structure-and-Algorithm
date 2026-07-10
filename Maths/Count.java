/*count digit */
package Maths;

public class Count {

    public static void countDigit(int num){
        int count = 0;
        while(num!=0){
            count++;
            num = num/10;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        countDigit(1258936);
        
    }
    
}
