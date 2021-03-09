import java.util.Arrays;

public class Selectionsort {
    public static long timer(double[] testArray) {
        long start = System.currentTimeMillis();
        selectionSort(testArray);
        long end = System.currentTimeMillis();
        long diff = end - start;
        if (check(testArray)) {
            return diff;
        }
        else{
            return -1;
        }
    }
    private static double[] selectionSort(double[] testArray) {
        double []arr = Arrays.copyOfRange(testArray,0,testArray.length);
        int smallest;
        double temp;
        for (int i = 0; i < arr.length ; i++) {
            smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
        return arr;
    }
    private static boolean check(double[] testArray){
        double[] arr1 = Arrays.copyOfRange(testArray, 0 , testArray.length);
        double[] arr2 = selectionSort(testArray);
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