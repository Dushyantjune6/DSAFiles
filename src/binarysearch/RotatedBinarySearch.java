package binarysearch;

import java.util.*;
public class RotatedBinarySearch {

    public static int RBS(int[] arr, int target){
        int pivot = findPivot(arr);
        System.out.println(pivot);
        if(arr[pivot] == target){
            return pivot;
        }
        if(pivot == -1){ //No pivot found i.e.array is not rotated
            return binarySearch(arr, target, 0, arr.length-1);
        }
        if(target <= arr[pivot] && target >= arr[0]){     //Target lies in b/w arr[0] and arr[pivot-1]
            System.out.println("line 14 executed");
            return binarySearch(arr, target, 0, pivot-1);
        }else {
            System.out.println("line 17 executed");
            return binarySearch(arr, target, pivot + 1, arr.length - 1); //Target lies in b/w arr[pivot-1] and arr[end]
        }
    }

    public static int findPivot(int[] arr){
        //This method utilizes thr property of pivot to find the max element i.e. pivot in the array
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start+(end-start)/2;

            if(mid < arr.length && arr[mid+1] < arr[mid]){
                return mid;
            }else if(mid > 0 && arr[mid-1] > arr[mid]){
                return arr[mid-1];
            }else if(arr[start] > arr[mid]){
                end = mid-1; //shortening the range of search
            }else if(arr[start] < arr[mid]){
                start = mid+1; //as start is smaller than mid and b/w start and mid all the elements will be < mid+1
            }                  //So skipping the search and finding big elements from mid+1
        }
        return -1; //No pivot found i.e. array is not rotated
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {

        System.out.println("44   "+start + end);
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {3,4,5,6,7,0,1,2};

        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println(RBS(arr, target));

    }
}
