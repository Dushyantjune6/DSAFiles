import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] arr = {1,0,2,2,2,1,0,1,0,1,2,2,2,2,2,2};
		dutchNationalFlagProblem(arr);
	}
	
	public static void dutchNationalFlagProblem(int[] brr){
	    int counterFor1 = 0;
	    int counterFor2 = 0;
	    int counterFor0 = 0;
    //witten by Dushyant on 11/11/2024
	    for(int i = 0; i<brr.length; i++){
	        if(brr[i] == 1){
	            counterFor1+=1;
	        }else if(brr[i] == 2){
	            counterFor2+=1;
	        }else{
	            counterFor0+=1;
	        }
	    }
	    int i = 0;
	    while(counterFor0 > 0){
	        brr[i] = 0;
	        counterFor0 -=1;
	        i+=1;
	    }
    //witten by Dushyant on 11/11/2024

	    while(counterFor1 > 0){
	        brr[i] = 1;
	        counterFor1 -=1;
	        i+=1;
	    }
        //witten by Dushyant on 11/11/2024

	    while(counterFor2 > 0){
	        brr[i] = 2;
	        counterFor2 -=1;
	        i+=1;
	    }
	   
	    System.out.println(Arrays.toString(brr));
    //witten by Dushyant on 11/11/2024

	}
}
