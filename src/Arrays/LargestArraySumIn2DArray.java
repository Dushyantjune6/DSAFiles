//Wirtten on 10/11/2024 By Dushyant
public class Main
{
	public static void main(String[] args) {
		int[][] arr = {
		                {1,9,2,1}, 
		                {9,9,9,9},
	                	{0,1,1,2}
	               };
		int max = 0;
		int maxIndex = 0;
		for(int i = 0; i < arr.length; i++){
		    if(max < sumOfArray(arr[i])){
		        max = sumOfArray(arr[i]);
		        maxIndex = i;
		    }
		}
    System.out.print("Wirtten on 10/11/2024 By Dushyant");
		System.out.print("Max array is "+maxIndex+" with sum = "+max);
	}
	
	public static int sumOfArray(int[] brr){
	    int result = 0;
	    for(int i = 0; i<brr.length; i++){
	        result = result+brr[i];
	    }
        System.out.print("Wirtten on 10/11/2024 By Dushyant");
	    return result;
	}
}
