import java.util.Arrays;

public class Insertionsort {
    public static long timer(double[] testArray){
        long start = System.currentTimeMillis();
        insertionSort(testArray);
        long end = System.currentTimeMillis();
        long diff = end - start;
        if(check(testArray)){
            return diff;
        }
        else return -1;
    }
    private static double[] insertionSort(double [] testArray){
        double[] arr = Arrays.copyOfRange(testArray,0,testArray.length);
        for (int i = 1;i < arr.length; i++){
            double temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1] = temp;
        }
        return arr;
    }
    private static boolean check(double[] testArray){
        double[] arr1 = Arrays.copyOfRange(testArray, 0 , testArray.length);
        double[] arr2 = insertionSort(testArray);
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
