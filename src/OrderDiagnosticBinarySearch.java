public class OrderDiagnosticBinarySearch {
    public static int orderDiagnosticBinarySearchMethod(int[] arr, int target){
        boolean isAscending = false;
        if(arr[0] < arr[1]){
            isAscending =true;
        }
        int start = 0;
        int end = arr.length-1;

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
    public static void main(String[] args){
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        int[] brr = {9,8,7,6,5,4,3,2,1,0};

        System.out.println("Ascending array: \n Target = 0 Index: "+ orderDiagnosticBinarySearchMethod(arr,0));
        System.out.println("Decending array: \n Target = 0 Index = "+ orderDiagnosticBinarySearchMethod(brr,0));

    }
}
