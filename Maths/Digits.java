/*print digits of a number*/
package Maths;

public class Digits {

    public static void printDigit(int num){
        while(num != 0){
            int digit = num%10;
            System.out.println(digit);
            num=num/10;
        }
    }
    public static void main(String[] args) {
        printDigit(53217);
       

    }

    
}