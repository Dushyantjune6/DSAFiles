import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Set_Mismatch_645 {
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void cyclicSort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i] < arr.length && arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }else{
                i++;
            }
        }
    }
    public static int[] findMismatches(int[] arr){
        List<Integer> list = new ArrayList<>();
        for(int i=0; i< arr.length; i++){
            if(arr[i] != i+1){
               return new int[] {arr[i], i+1};
            }
        }
        return new int[] {-1,-1};
    }
    public static void main(String[] args) {
        int[] arr= {1,2,2,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(findMismatches(arr)));
//        System.out.println(Arrays.toString(arr));
    }
}
