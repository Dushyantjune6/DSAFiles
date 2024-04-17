package BitsAndNumberSystems;

import java.util.Scanner;

public class CheckingIfEnteredNumberIsAPowerOf2 {
    static public boolean checkingPowerOf2(int n){
        boolean ans = (n & (n-1)) == 0;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked: ");
        int n = sc.nextInt();
        System.out.println(checkingPowerOf2(n));
    }
}
