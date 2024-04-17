package recursion;

import java.util.Scanner;

public class ReverseANumber {
    public static int reverse (int n){
        if(n <= 0 ){
            return 1;
        }
        return n%10 * reverse(n/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverse(n));
    }
}
