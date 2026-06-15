class Test{
    int a;
    public Test(int i){ a=i; }
    public void swap(Test b){
        int temp = a;
        a = b.a;
        b.a = temp;
    }
}

public class TestSwap{
    public static void main(String[] s){
        Test obj1 = new Test(10);
        Test obj2 = new Test(20);
        System.out.println("Inside obj1: " + obj1.a);
        System.out.println("Inside obj2: " + obj2.a);
        System.out.println("Swapping...");
        obj1.swap(obj2);
        System.out.println("Inside obj1: " + obj1.a);
        System.out.println("Inside obj2: " + obj2.a);
    }
}
