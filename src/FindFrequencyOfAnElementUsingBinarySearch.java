import java.util.Scanner;

public class FindFrequencyOfAnElementUsingBinarySearch {
    public static int findFrequency(int [] arr,int target, boolean findFirstIndex){

        int start = 0;
        int ans = -1;
        int end = arr.length-1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(arr[mid] > target){
                end = mid-1;
            }else if(arr[mid] < target){
                start = mid+1;
            }else{
                ans = mid;
                if(findFirstIndex){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }

    public static int[] findFrequencyDriver(int[] arr, int target){
        int[] ans = {-1, -1};
        int start = findFrequency(arr, target, true);
        if(start != -1){
            ans[0] = start;
            ans[1] = findFrequency(arr, target, false);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,5,5,5,7,7,7,77};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int[] brr = findFrequencyDriver(arr, target);
        System.out.println("Frequency = " + (brr[1]-brr[0]+1));
    }
}
