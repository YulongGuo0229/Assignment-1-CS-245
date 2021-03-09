import java.util.Arrays;
public class Mergesort {
    public static long timer(double[] testArray) {
        long start = System.currentTimeMillis();
        sort(testArray);
        long end = System.currentTimeMillis();
        long diff = end - start;
        if (check(testArray)) {
            return diff;
        }
        else{
            return -1;
        }
    }
    private static double[] sort(double[] testArray){
        double[] arr = Arrays.copyOf(testArray, testArray.length);
        if (arr.length < 2) {
            return arr;
        }
        int middle = (int) Math.floor(arr.length / 2);
        double[] left = Arrays.copyOfRange(arr, 0, middle);
        double[] right = Arrays.copyOfRange(arr, middle, arr.length);
        return merge(sort(left), sort(right));
    }
    private static double[] merge(double[] left, double[] right) {
        double[] result = new double[left.length + right.length];
        int i = 0;
        while (left.length > 0 && right.length > 0) {
            if (left[0] <= right[0]) {
                result[i++] = left[0];
                left = Arrays.copyOfRange(left, 1, left.length);
            } else {
                result[i++] = right[0];
                right = Arrays.copyOfRange(right, 1, right.length);
            }
        }

        while (left.length > 0) {
            result[i++] = left[0];
            left = Arrays.copyOfRange(left, 1, left.length);
        }

        while (right.length > 0) {
            result[i++] = right[0];
            right = Arrays.copyOfRange(right, 1, right.length);
        }
        return result;
    }

    private static boolean check(double[] testArray){
        double[] arr1 = Arrays.copyOfRange(testArray, 0 , testArray.length);
        double[] arr2 = sort(testArray);
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
