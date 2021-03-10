import java.util.Arrays;
import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        int size = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the size of array: ");
        size = scan.nextInt();
        double[] arr = new double[size];
        for (int i = 0; i < size; i++) {
            final double d = Math.random();
            final int k = (int) (d * 10 * size);
            arr[i] = (k);
        }
        if (arr == null || arr.length <= 0)
            System.out.println(Arrays.toString(arr));
        long start = System.currentTimeMillis();
        Sort.hybridSort(arr, 0, arr.length - 1);
        long end = System.currentTimeMillis();
        long diff = end - start;
        boolean same = Check.check(arr);
        if (same){
            System.out.println(Arrays.toString(arr));
            System.out.println("The time cost by sort function is : "+ diff);
        }
        else {
            System.out.println("Error with sort function, result doesn't match");
        }

    }
}