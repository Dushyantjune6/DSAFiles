package recursion;

import java.util.Scanner;

public class SumOfDigits {
    public static int sum (int n){
        if(n <= 1){
            return 1;
        }
        return n%10 + sum(n/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 11111;
        System.out.println(sum(n));
    }
}
