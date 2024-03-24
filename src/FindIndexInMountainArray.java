import java.util.*;
public class FindIndexInMountainArray {

    public static int search(int []arr, int target){
        int peakElement = findMaxElementInArray(arr);
        int firstTry = orderDiagnosticBinarySearchMethod(arr, target,0, peakElement);
        if(firstTry != -1){
            return firstTry;
        }else{
            int secondTry = orderDiagnosticBinarySearchMethod(arr, target, peakElement+1, arr.length-1);
            if(secondTry != -1){
                return secondTry;
            }
        }
        return -1;
    }

    public static int orderDiagnosticBinarySearchMethod(int[] arr, int target, int start, int end){
        boolean isAscending = false;
        if(arr[start] < arr[end]){
            isAscending = true;
        }

        while(start <= end){
            int mid = start+(end-start)/2;
            if(isAscending){
                if(arr[mid] < target){
                    start = mid+1;
                }else if(arr[mid] > target){
                    end = mid-1;
                }else{
                    return mid;
                }
            }else{
                if(arr[mid] < target){
                    end = mid-1;
                }else if(arr[mid] > target){
                    start = mid+1;
                }else{
                    return mid;
                }
            }
        }
        return -1;
    }
    public static int findMaxElementInArray(int[] arr){
        //to find peak index
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start+(end-start)/2;
            if(arr[mid] > arr[mid+1]){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return start;
    }

    public static void main(String[] args){
        int[] arr = {0,0,1,35,66,77,89,86,35,13,10,8,1};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        System.out.println(search(arr, target));
    }
}
