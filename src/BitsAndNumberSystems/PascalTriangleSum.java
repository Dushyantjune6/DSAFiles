package BitsAndNumberSystems;

import java.util.Scanner;

public class PascalTriangleSum {
        public static int pascalTriangleRowSum(int n){
            return 1<<(n-1);
        }
        public static void main(String[] args) {
            System.out.println("Enter the number of row whose sum is to be printed: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println("The total of elements present in row "+n+" is = "+pascalTriangleRowSum(n));
        }
}

