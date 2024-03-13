import java.util.Scanner;

public class CeilingProblem {

    public static int ceilingProblemUsingBinarySearch(int[] arr, int target){
        int start=0;
        int end = arr.length-1;

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

        int[] arr = {1,2,3,5,9,81,89,90,98};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        System.out.println(ceilingProblemUsingBinarySearch(arr,target));
    }
}
