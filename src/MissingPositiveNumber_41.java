public class MissingPositiveNumber_41 {

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void cyclicSort(int[] arr){
        int i=0;
        while(i < arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }else{
                i++;
            }
        }
    }
    public static int firstMissingPositive(int[] arr){

        cyclicSort(arr);
        int i=0;
        while(i < arr.length) {
            if (arr[i] > 0 && arr[i] <= arr.length){
               if(arr[i] != i+1){
                   return i;
               }else{
                   i++;
               }
            }
        }
        return arr.length+1;

    }

    public static void main(String[] args) {

    }
}
