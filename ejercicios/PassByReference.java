class Test{
    int a, b;
    Test(int i, int j){
        a = i;
        b = j;
    }
    void change(Test obj){
        obj.a += obj.b;
        obj.b = -obj.b;
    }
}

public class PassByReference{
    public static void main(String[] s){
        Test obj = new Test(15,20);
        System.out.println("a: " + obj.a + " b: " + obj.b);
        obj.change(obj);
        System.out.println("a: " + obj.a + " b: " + obj.b);
    }
}
