import java.util.*;
public class PalindromeNumber {

    public static boolean palindromeNumberCheck(int target){
        int temp = target;
        int reversedNumber = 0, digit = 0;

        while(temp > 0){
            digit = temp%10;
            reversedNumber = reversedNumber*10+digit;
            temp = temp/10;
        }
        if(target == reversedNumber){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number i.e. to be checked: ");
        int target = sc.nextInt();
        if(palindromeNumberCheck(target)){
            System.out.println("Yes it's a palindrome!");
        }else{
            System.out.println("Not a palindrome.");
        }
    }
}
