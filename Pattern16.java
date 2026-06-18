/*
E
E D 
E D C
E D C B
E D C B A
*/

package Patterns;

public class Pattern16 {
    public static void main(String[] args){
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print((char)('E'-j)+" ");
            }
            System.out.println();
        }
    }
    
}
