/*Create a method calculatepercentage(int Obtained, int Total) */
package Method;

public class Percentage {

    public static double getPercentage(int Obtained, int Total){
        double percent = ((double)Obtained/Total)*100;
        return percent;
    }

    public static void main(String[] args){
        System.out.println(getPercentage(1201,1400 ));

    }
    
}

//time complexity: O(1);

//space complexity:O(1)
