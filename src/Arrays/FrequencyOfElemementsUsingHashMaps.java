import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] arr = {1,2,12,97,97,97,1,2,3,11,10,19,29,97,2,1};
		frequencyCounter(arr);
	}
	public static void frequencyCounter(int[] arr){
	    Map<Integer, Integer> frequencyMap = new HashMap<>();
	    for(int n : arr){
            if(frequencyMap.containsKey(n)){
                frequencyMap.put(n, frequencyMap.get(n)+1);
            } else {
                frequencyMap.put(n, 1);
            }
        }
        for(Integer key : frequencyMap.keySet()){
       System.out.println("Element: "+key+" frequency: "+frequencyMap.get(key));
        }
	}
}
