package binarysearch;

import java.util.*;
public class FloorProblem {

    public static int floorProblemUsingBinarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

        if(target < arr[0]){
            return -1;
        }

        while(start <= end){
            int mid = start+(end-start)/2;

            if(target > arr[mid]){
                start = mid+1;
            }else if(target < arr[mid]){
                end = mid-1;
            }else{
                return arr[mid-1];  //Returning the element smaller than the target element
            }
        }
        return arr[end];
    }
    public static void main(String[] args){
        int[] arr ={1 ,2 ,8 ,10 ,11 ,12 ,19};
        Scanner sc = new Scanner(System.in);
        int target =sc.nextInt();

        System.out.println(floorProblemUsingBinarySearch(arr, target));
    }
}
