//Find the average of array elements

package Arrays;
import java.util.Scanner;
public class Average {
    public static void findAverage(int arr[]){
        double  sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        double average = sum/arr.length;
        System.out.println("The average of the array elements is: " + average);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        findAverage(arr);
        sc.close();
    }
    
}
