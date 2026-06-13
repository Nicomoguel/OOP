public class Quicksort{
    static void qsort(int[] arr){
        qs(arr, 0, arr.length-1);
    }

    private static void qs(int arr[], int left, int right){
        int i, j;
        int piv, temp;
        i = left;
        j = right;
        piv = arr[(left + right) / 2];
        do{
            
            while((arr[i] < piv) && (i < right)) i++;
            while((arr[j] > piv) && (j > left)) j--;

            if(i <= j){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            
        }while(i <= j);


        if(left < j) qs(arr, left, j);
        if(right > i) qs(arr, i, right);


    }

}
