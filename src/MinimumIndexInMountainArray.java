import java.util.Scanner;

public class MinimumIndexInMountainArray {

    //A monotonic array where size > 3 is a mountain array
        public static int binarySearch(int [] arr){

            int start = 0;
            int end = arr.length-1;
            while(start <= end){
                int mid = start+(end-start)/2;
                if(arr[mid] < arr[mid+1]){
                    end = mid;
                }else {
                    start = mid + 1;
                }
                return start;
            }
            return -1;
        }
        public static void main(String[] args){
            int[] arr = {0,1,2,3,14,15,19,22,23,29,27,25,23,22,11,9,3,0};
            Scanner sc = new Scanner(System.in);
            System.out.println("Min Index: "+binarySearch(arr)+"\nMin value: "+arr[binarySearch(arr)]);
        }
}
