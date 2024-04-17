package recursion;

import java.util.Scanner;

public class ProductOfDigits {
    public static int product (int n){
        if(n % 10 == n){
            return n;
        }
        return n%10 * product(n/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 555;
        System.out.println(product(n));
    }
}
