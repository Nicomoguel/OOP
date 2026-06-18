class X{
    int a;
    public X(int i){
        a = i;
    }
}
class Y extends X{
    int b;
    public Y(int i, int j){
        super(i);
        b = j;
    }
}
public class SupSubRef{
    public static void main(String[] s){
        X x1 = new X(11);
        X x2;
        Y y1 = new Y(5,6);
        x2 = x1;
        System.out.println(x2.a);
        x2 = y1;
        System.out.println(x2.a);
        //System.out.println(x2.b);


    }
}
