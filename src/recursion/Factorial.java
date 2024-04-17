package recursion;
import java.util.*;
public class Factorial {
    public static int factorial(int n){
        if(n<=1){
            return 1;
        }
        return n*factorial(n-1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 9;

        System.out.println(factorial(n));
    }

}
