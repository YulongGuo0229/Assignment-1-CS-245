import java.util.Arrays;

public class Quicksort {

    public static long timer(double[] testArray) {
        long start = System.currentTimeMillis();
        double []arr = Arrays.copyOfRange(testArray,0,testArray.length);
        quickSort(arr, 0, arr.length - 1);
        long end = System.currentTimeMillis();
        long diff = end - start;
        if(check(testArray)){
         return diff;
        }
        else {
            return -1;
        }
    }
    private static double[] quickSort(double[] arr, int low, int high) {
        int i = low;
        int j = high;
        double middle = arr[(low + high) / 2];
        while(i <= j) {
            while(arr[i] < middle ) {
                i++;
            }
            while(arr[j] > middle) {
                j--;
            }
            if( i <= j) {
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        if(low < j) {
            quickSort(arr, low, j);
        }

        if(i < high) {
            quickSort(arr, i, high);
        }
        return arr;
    }
    private static void swap(double[] arr, int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private static boolean check(double[] testArray){
        double[] arr1 = Arrays.copyOfRange(testArray, 0 , testArray.length);
        double[] arr2 = quickSort(testArray,0, testArray.length - 1);
        boolean same = true;
        Arrays.sort(arr1);
        for (int i = 0; i < arr2.length; i++){
            if(arr2[i] != arr1[i]){
                same = false;
            }
        }
        return same;
    }
}