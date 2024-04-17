package cyclicsort;

import java.util.*;
public class FindAllDuplicates_442 {

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void cyclicSort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }else{
                i++;
            }
        }
    }
    public static void findDuplicates(int[] arr){
        List<Integer> list = new ArrayList<>();
        for(int i=0; i< arr.length; i++){
            if(arr[i] != i+1){
                list.add(arr[i]);
                list.add(arr[i]+1);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr= {1,1};
        cyclicSort(arr);
        findDuplicates(arr);
//        System.out.println(Arrays.toString(arr));
    }
}
