package binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastPositionOfElement34 {

    public static int search(int[] arr,int target, boolean findStartIndex){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        while(start <= end){
            int mid = start+(end-start)/2;
            if(target > arr[mid]){
                start = mid+1;
            }else if(target < arr[mid]){
                end = mid-1;
            }else{
                ans = mid;
                if(findStartIndex){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }

    public static int[] firstAndLastOccurence(int[] arr, int target){
        int[] ans = {-1, -1};
        int start = search(arr, target, true);
        if(start != -1) {
            ans[0] = start;
            int end = search(arr, target, false);
            ans[1] = end;
        }

        return ans;
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int targer = sc.nextInt();
    int[] arr = {1,2,3,4,4,5,5,5,5,7,7,7,77};
        System.out.println(Arrays.toString(firstAndLastOccurence(arr, targer)));
    }
}
