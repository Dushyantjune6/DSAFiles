package cyclicsort;

import java.util.*;
public class Find_All_Numbers_Disappeared_448 {

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void cyclicSort(int[] arr){
        int i=0;
        while (i < arr.length){
            int correctPosition = arr[i] -1; //arr[arr[i]] == correctPosition
            if( arr[i] != arr[correctPosition]){
                swap(arr, i, correctPosition);
            }else{
                i++;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        cyclicSort(arr);
        List<Integer> list = new ArrayList<>();
        for(int index=0; index<arr.length; index++){
            if( arr[index] != index+1){
                list.add(index+1);
            }
        }
        System.out.println(list);
//        return list;
    }
}
