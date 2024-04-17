package binarysearch;

import java.util.Scanner;

public class CeilingProblem {

    public static int ceilingProblemUsingBinarySearch(int[] arr, int target){
        int start=0;
        int end = arr.length-1;

        if(target > arr[arr.length-1]){
            return -1; //check to make sure value bigger than the target exists in the array
        }

        while(start<=end){
            int mid = start+(end-start)/2;
            if(target > arr[mid]){
                start = mid+1;
            }else if( target < arr[mid]){
                end = mid-1;
            }else{
                return mid;
            }
        }
        return arr[start];
    }
    public static void main(String[] args){

        int[] arr = {11,12,32,51,60,71,82};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        System.out.println(ceilingProblemUsingBinarySearch(arr,target));
    }
}
