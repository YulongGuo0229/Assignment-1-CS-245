import java.util.Arrays;

public class Check {
    public static boolean check(double[] testArray){
        double[] arr1 = Arrays.copyOfRange(testArray, 0 , testArray.length);
        double[] arr2 = Arrays.copyOfRange(testArray, 0, arr1.length);
        boolean same = true;
        Arrays.sort(arr1);
        Sort.hybridSort(arr2,0, arr2.length - 1);
        for (int i = 0; i < arr2.length; i++){
            if(arr2[i] != arr1[i]){
                same = false;
            }
        }//In this function, I set a checker to check the output is correct or not, if the output is correct, this fucntion will return true else will return false.
        return same;
    }
}
