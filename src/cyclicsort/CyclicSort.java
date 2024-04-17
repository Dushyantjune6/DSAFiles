package cyclicsort;

import java.util.*;
public class CyclicSort {
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void cycleSort(int[] arr){

        int end = arr.length;
        int index = 0;
        while(index < end){
            int element = arr[index];
            int correctPosition = element-1;
            if(arr[index] < end && arr[index] != arr[correctPosition]){
                swap(arr,index, correctPosition);
            }else{
                index++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr= {4,5,6,1,2,8,3};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
