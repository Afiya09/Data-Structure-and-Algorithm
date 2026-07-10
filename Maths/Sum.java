/*sum digit */
package Maths;

public class Sum {
    public static void sumDigit(int num){
        int sum=0;
        while(num != 0){
            int digit=num%10;
            sum+=digit;
            num=num/10;
        }
        System.out.println(sum);

    }
    public static void main(String[] args) {
        sumDigit(53741);
    }
    
}
