import java.util.Arrays;

public class Bubblesort {
    public static long timer(double[] testArray){
        long start = System.currentTimeMillis();
        bubbleSort(testArray);
        long end = System.currentTimeMillis();
        long diff = end - start;
        if(check(testArray)){
            return diff;
        }
        else return -1;
    }
    private static double[] bubbleSort(double[] testArray) {
        double[] arr = Arrays.copyOfRange(testArray,0,testArray.length);
        for (int i = 1; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    double tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        return arr;
    }
    private static boolean check(double[] testArray){
        double[] arr1 = Arrays.copyOfRange(testArray, 0 , testArray.length);
        double[] arr2 = bubbleSort(testArray);
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
