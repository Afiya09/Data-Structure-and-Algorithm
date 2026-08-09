//Find the mode of the array
package ArrayManipulation;
import java.util.HashMap;
public class GetMode {
    public static int getMode(int arr[]){
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num: arr){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        int maxFreq = 0;
        int maxFreqKey = 0;
        for(int key: freq.keySet()){
            int currentFreq = freq.get(key);
            int currentKey = key;
            if(currentFreq > maxFreq){
                maxFreq = currentFreq;
                maxFreqKey = currentKey;

            }
        }
        return maxFreqKey;
    }

    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,1,2,1};
        System.out.println(getMode(arr));
    }
    
}
