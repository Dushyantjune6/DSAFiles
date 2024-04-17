package binarysearch;

import java.util.*;
public class IndexOfElementInInfiniteArray {
    public static int binarySearch(int[] arr, int target, int start, int end){
        //this method runs on the basis of start and end values shared by findRange method
        while(start <= end){
            int mid = start+(end-start)/2;
            if(target > arr[mid]){
                start = mid+1;
            }else if(target < arr[mid]){
                end = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static int findRange(int[] arr, int target){
        //This method will keep on doubling the size of the range unless the target comes under it
        //i.e. target needs to be lesser than arr[end]
        int start =0, end =1;
        while(target > arr[end]){
            int temp = end;             //storing index of old end
            end = end+(end-start+1)*2;  //size of new end will be old end + (end-start+1)*2 which is 2*size of current range
            start = temp+1;             //new start will be old end+1
        }
        return binarySearch(arr, target, start, end);
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,11,13,14,17,19,22,24};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println(findRange(arr, target));
    }

}
