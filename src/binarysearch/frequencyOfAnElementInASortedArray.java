package binarysearch;
import java.util.*;
public class frequencyOfAnElementInASortedArray {
    public static int binarySearch(int[] arr, int target, boolean firstIndex){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        while(start <= end){
            int mid = start+(end-start)/2;
            if(arr[mid] > target){
                end = mid-1;
            }else if(arr[mid] < target){
                start = mid+1;
            }else{
                ans = mid;
                if(firstIndex){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }

    public static int[] firstAndLastOccurence(int[] arr, int target){
        int ans[] = {-1,-1};
        ans[0] =binarySearch(arr, target, true);
        if(ans[0] != -1){
            ans[1] = binarySearch(arr, target, false);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,4,4,4,5,6,7,7,7,8,9,9,9,9,11,23,23,23,23,44,55};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int diff[] = firstAndLastOccurence(arr, target);
        if(diff[0] != -1) {
            System.out.println("The frequency of " + target + " is: " + (diff[1] - diff[0] + 1));
        }else{
            System.out.println("Element not found!");
        }
    }
}
