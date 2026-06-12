public class Demo{
    public static void main(String[] s){
       Queue p1 = new Queue(10);
       for(int i=0; i<10; i++){
            p1.put(i + 1);
        }
        int[] arr = {34, 57, 77};
        Queue p2 = new Queue(arr);
        Queue p3 = new Queue(p1);
        int x;
        System.out.println("Elements of p1:");
        for(int i = 0; i <= 10; i++){
            x = p1.get();
            if(x!=0){
                System.out.println(x);
            }else{
                System.out.println("Queue is empty");
            }
        }
        System.out.println("\nElements of p2:");
        for(int i = 0; i <= 3; i++){
            x = p2.get();
            if(x!=0){
                System.out.println(x);
            }else{
                System.out.println("Queue is empty");
            }
        }
        System.out.println("Elements of p3:");
        for(int i = 0; i <= 10; i++){
            x = p3.get();
            if(x!=0){
                System.out.println(x);
            }else{
                System.out.println("Queue is empty");
            }
        }
        

    }
}
