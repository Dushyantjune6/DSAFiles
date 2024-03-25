import java.util.*;
public class Find_Duplicate_Numbers_Using_CyclicSort_287 {

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static  void cyclicSort(int[] arr){
        int i = 0;
        int end = arr.length;
        while(i < end){
            int correctPosition = arr[i]-1;
            if(arr[i] < end && arr[i] != arr[correctPosition]){
                swap(arr, i, correctPosition);
            }else{
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer>list = new ArrayList<>();
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i=0; i<arr.length; i++){
            int correctIndex = arr[i] -1;
            if(arr[i] != i+1){
                if(arr[i] != arr[correctIndex]) {
                    swap(arr, i, correctIndex);         //Swapping the element if it doesn't exist at correct place
                }else{
                list.add(arr[i]);
                }
            }
        }
        System.out.println(list);
    }
}
