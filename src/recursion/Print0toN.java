package recursion;
import java.util.*;
public class Print0toN {
    public static void recursion(int n){
        if (n==0){
            return ;
        }
        System.out.println(n);
        recursion(n-1);
    }
    public static void revRecursion(int n){
        if (n==0){
            return ;
        }
        revRecursion(n-1);
        System.out.println(n);
    }
    public static void dualRecursion(int n){
        if (n==0){
            return ;
        }
        System.out.println(n);
        dualRecursion(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        recursion(n);
//        revRecursion(n);
        dualRecursion(n);
    }
}
