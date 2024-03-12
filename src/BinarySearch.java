import java.util.*;
public class BinarySearch
    {
        public static int binarySearch(int[] arr, int target){
            int start = 0;
            int end = arr.length-1;
            System.out.println(Arrays.toString(arr));

            while(start <= end){
                int mid = start+(end-start)/2;

                if(target > arr[mid]){
                    start = mid+1;
                }else if(target < arr[mid]){
                    end = mid-1;
                }else {
                    return mid;
                }
            }
            return -1;
        }
        public static void main(String[] args) {
            int[] arr = {1,2,3,444,555,666,9999};
            Scanner sc = new Scanner(System.in);
            int target = sc.nextInt();
            System.out.println(binarySearch(arr,target));

        }
    }

