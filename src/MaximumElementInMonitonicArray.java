import java.util.*;
public class MaximumElementInMonitonicArray {
public static int binarySearch(int [] arr){

    int start = 0;
    int end = arr.length-1;
    while(start < end){                       //This loop will keep on searching for the biggest element
        int mid = start+(end-start)/2;
        if(arr[mid] > arr[mid+1]){            //We're in the Decreasing side i.e. arr[7] > arr[8]
                   end = mid;                //end may be the answer that's why we're not taking end = mid-1 as mid is > mid+1
                                            // End your range and seek for element in right
                                            // Search in the left for bigger possible ans

        }else {                               //We're in the Increasing side i.e. arr[2] < arr[3]
                                              //taking start as mid+1 as mid+1 > mid
                                              //Search in the Right for bigger possible ans
            start = mid+1;                    //seek for more bigger element starting range from mid+1
        }
        /***
         * The end and start will keep on searching for biggest element and will come to a place
         * Where they'll be the same and will find the biggest element
         ***/
        return start; //as start and end are same we can return anything
    }
    return -1;
}
public static void main(String[] args){
    int[] arr = {0,1,2,3,14,15,19,22,23,29,27,25,23,22,11,9,3,0};
    Scanner sc = new Scanner(System.in);
    System.out.println("Max Index: "+binarySearch(arr)+"\nMax value: "+arr[binarySearch(arr)]);
}

}
