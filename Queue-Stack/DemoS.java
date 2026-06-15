public class DemoS{
    public static void main(String[] s){
        // First stack with 10 elements
        Stack s1 = new Stack(10);
        int x;
        System.out.println("Pushing into stack 1 in order: ");
        for(int i = 1; i <= 10; i++){
            System.out.println(i*10);
            s1.push(i*10);
        }
        System.out.println("Popping out of stack 1 in order: ");
        for(int i = 0; i < 10; i++){
            x = s1.pop();
            System.out.println(x);
        }

        int[] arr = {1,7,4,5,7,8};
        Stack s2 = new Stack(arr);
        System.out.println("Popping out of stack 2 in order: ");
        for(int i = 0; i < arr.length; i++){
            x = s2.pop();
            System.out.println(x);
        }

        Stack s3 = new Stack(s2);

        System.out.println("Popping out of stack 3 (s2) in order: ");
        for(int i = 0; i < arr.length; i++){
            x = s3.pop();
            System.out.println(x);
        }




    }
}
