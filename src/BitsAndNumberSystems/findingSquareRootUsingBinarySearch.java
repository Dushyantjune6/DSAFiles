package BitsAndNumberSystems;
import java.util.*;
public class findingSquareRootUsingBinarySearch {
        public static double binarySearchToFindSquareRoot(int target, int precision){
            int start = 0;
            int end = 0;
            double root=0.0;

            while(start <= end){
                int mid = start+(end-start)/2;

                if(mid*mid == target){
                    return mid;
                }else if(mid*mid < target){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
            double increment = 0.1;
            for(int i=0; i<precision; i++){
                while(root*root <= target){
                    root+=increment;
                }
                root -= increment;
                increment/=10;
            }
            return root;
        }


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int target = sc.nextInt();
            int precision = sc.nextInt();

            System.out.println(binarySearchToFindSquareRoot(target, precision));
        }
}
