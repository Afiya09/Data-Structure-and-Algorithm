/*
      A
    A B A
  A B C B A
A B C D C B A
*/

package Patterns;

public class Pattern20 {
    public static void main(String[] args){
        int n =4;
        for( int i=1; i<=4; i++){
            for(int j=1; j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=0; j<i;j++){
                System.out.print((char)('A'+j)+" ");
            }
            
            for(int j =i-2;j>=0;j--){
                System.out.print((char)('A'+j)+" ");
            }
            System.out.println();
        }
    }
    
}
