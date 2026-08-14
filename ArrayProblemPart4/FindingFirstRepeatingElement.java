package ArrayProblemPart4;

import java.util.HashMap;

public class FindingFirstRepeatingElement {
    public static int firstRepeatingElement(int[] arr){
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num: arr){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

        for(int i : arr){
            if(freq.get(i)>1){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args){
        int[] arr = {10,5,3,4,3,5,6};
        System.out.println(firstRepeatingElement(arr));
    }
    
}
