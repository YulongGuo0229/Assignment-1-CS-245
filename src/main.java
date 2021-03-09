import java.util.Scanner;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int size = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the size of array: ");
        size = scan.nextInt();
        double[] testArray = new double[size];
        for (int i = 0; i < size; i++) {
            final double d = Math.random();
            final int k = (int)(d*10*size);
            testArray[i] = (k);
        }
        long bs = Bubblesort.timer(testArray);
        System.out.println("The time used by Bubble Sort is: " + bs);
        long ss = Selectionsort.timer(testArray);
        System.out.println("The time used by Selection Sort is: " + ss);
        long is = Insertionsort.timer(testArray);
        System.out.println("The time used by Insertion Sort is: " + is);
        long ms = Mergesort.timer(testArray);
        System.out.println("The time used by Merge Sort is: " + ms);
        long qs = Quicksort.timer(testArray);
        System.out.println("The time used by Quick Sort is: "+ qs);

    }
}
