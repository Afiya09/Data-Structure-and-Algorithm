//Find elements with high and low frequency in the array
package ArrayManipulation;
import java.util.HashMap;
public class HighLowFrequency {
    public static int[] getHighLowFrequency(int arr[]){
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num: arr){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;
        int maxFreqKey = 0;
        int minFreqKey = 0;
        for(int key: freq.keySet()){
            int currFreq = freq.get(key);
            int currKey = key;
            if(currFreq > maxFreq){
                maxFreq = currFreq;
                maxFreqKey = currKey; 
            }
        }

        for(int key: freq.keySet()){
            int currFreq = freq.get(key);
            int currKey = key;
            if(currFreq < minFreq){
                minFreq = currFreq;
                minFreqKey = currKey; 
            }
        }
        return new int[]{maxFreqKey, minFreqKey};
    }

    public static void main(String[] args) {
        int arr[]={1,1,3,4,5,1,2,2,3,4,4,4,5,5,1,5,4,2,3,3};
        int ans[] = getHighLowFrequency(arr);
        System.out.println("The Highest Frequency Element is: " + ans[0]);
        System.out.println("The Lowest Frequency Element is: " + ans[1]);


    }
    
}
