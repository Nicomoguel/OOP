class Outer{
    private int[] arr;
    public Outer(int[] nums){
        arr = nums;
    }

    public void analyze(){
        Inner inOb = new Inner();
        System.out.println("Minimum value: " + inOb.min());
        System.out.println("Maximum value: " + inOb.max());
        System.out.println("Average value: " + inOb.avg());
    }

    class Inner{
        int min(){
            int x = arr[0];
            for(int i = 1; i < arr.length; i++){
                if(arr[i] < x) x = arr[i];
            }
            return x;
        }
        int max(){
            int x = arr[0];
            for(int i = 1; i < arr.length; i++){
                if(arr[i] > x) x = arr[i];
            }   
            return x;
        }

        int avg(){
            int sum = 0;
            for(int i = 0; i < arr.length; i++){
                sum += arr[i];
            }
            return sum;
        }
        
    }
}

public class NestedDemo{
    public static void main(String[] s){
        int[] arr = {5,6,7,2,5};
        Outer obj = new Outer(arr);
        obj.analyze();
    }
}
