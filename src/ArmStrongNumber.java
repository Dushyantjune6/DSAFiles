

public class Main
{
	public static void main(String[] args) {
	    
	    
	    int n = 153;
		System.out.println(squaredValue(n) == n ? "IP is an armstrong number." : 
		"IP is not an armstrog number.");
	}
	public static int squaredValue( int n){
	    int res = 0;
	    while(n != 0){
	        int temp =  n%10;
	     res = res + temp*temp*temp; 
	     n = n/10;
	    }
	    return res;
	}
}
