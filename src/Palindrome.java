import java.util.Scanner;

public class Palindrome {
    public static boolean isPlaindrome(String str){
        int start = 0;
        int end = str.length()-1;
        while(start <= end){
            if(str.charAt(start) == str.charAt(end)){
                start+=1;
                end-=1;
            }else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean result = isPlaindrome(str);
        if(result){
            System.out.printf("%s String is palindrome ", str);
        }else{
            System.out.printf("%s String is not a palindrome ", str);
        }
    }
}
