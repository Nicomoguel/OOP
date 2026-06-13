public class QSortDemo{
    public static void main(String[] s){
        int[] arr = {46, 64, 34, 7, 4, 6, 4, 1};
        System.out.println("Original array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        Quicksort.qsort(arr);
        System.out.println("\nSorted array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
