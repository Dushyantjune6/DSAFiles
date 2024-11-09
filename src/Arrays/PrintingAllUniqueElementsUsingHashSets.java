import java.util.*;
public class Main
  // Written by Dushyant on 10-11-24
{
  //This approach is using hashset to confirm that if the element is pre-existing in the hashset, hashset returns false if the element is already there
	public static void main(String[] args) {
		
		HashSet<Integer> flag = new HashSet<>();
		List<Integer> uniqueList = new ArrayList<>();
		
		int[] arr = {1,2,12,1,2,3,11,10,19,29,97,2,1};
        for(int n : arr){
            if(flag.add(n)){ //returns false if the element is already there
                uniqueList.add(n);
            }
        }
        System.out.println(uniqueList.toString());
        System.out.println("Written by Dushyant on 10-11-24");
	}
}
