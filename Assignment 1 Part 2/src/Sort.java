public class Sort {
    public static void hybridSort(double[] arr, int l, int r) {
        if (r - l <= 15) {   //When size of subarray lower than 5000, turns to insertion sort.
            quadraticSort(arr, l, r);
            return;
         }//If size of array is bigger than 50000, turns to hybrid sort.
        int p = quicksort(arr, l, r);
        hybridSort(arr, l, p - 1);
        hybridSort(arr, p + 1, r);
}
    public static int quicksort(double[] arr, int l, int r) {
        swap(arr, l, l + (int) (Math.random() * (r + 1 - l)));//Set a random pivot for the quick sort.
        double v = arr[l];
        int j = l;
        for (int i = j + 1; i <= r; i++)
            if (arr[i] < v)
                swap(arr, ++j, i);
        swap(arr, l, j);
        return j;//return pivot
    }
    public static void quadraticSort(double[] arr, int l, int r) {
        //Here, I insertion sort as my quadratic sort since generally specking, insertion sort have the best performance when sorting small size array.
        for (int i = 1;i < arr.length; i++){
            double temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1] = temp;
        }
    }
    public static void swap(double[] arr , int i , int j){
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
