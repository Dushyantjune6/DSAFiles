package recursion;
import java.util.*;

public class BinarySearchUsingRecursion {
    public static int binarySearch(int[] arr, int target, int start, int end){

        if(start <= end){
            int mid = start+(end-start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(target > arr[mid]){
               return binarySearch(arr,target, mid+1, end);
            }else{
               return binarySearch(arr, target, 0, mid-1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,11,12,14,19,27,116};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println(binarySearch(arr,target,0,arr.length-1));
    }

}
