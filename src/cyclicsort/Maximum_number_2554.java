package cyclicsort;

import java.util.*;

public class Maximum_number_2554 {
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void cyclicSort(int[] arr){
        int i=0;
        while(i < arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i] < arr.length && arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }else{
                i++;
            }
        }
    }
    public static int missingNumbers(int[] arr, int maxSum){
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<=arr.length-1; i++){
            if(arr[i] != i+1){
                list.add(i+1);
            }
        }
        int start = 0;
        int end = list.size()-1;
        System.out.println(list);
        while(start <= end){
            int sum = list.get(start)+list.get(end);
            if(sum <= maxSum){
                return sum;
            }else{
                start++;
                end--;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7};
        int maxSum = 8;
        cyclicSort(arr);
        System.out.println(missingNumbers(arr,maxSum));
    }
}
