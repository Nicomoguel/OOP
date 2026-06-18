class Sup{
    public void who(){
        System.out.println("who() in sup");
    }
}
class Sub1 extends Sup{
    public void who(){
        System.out.println("who() in sub1");
    }
    
}
class Sub2 extends Sup{
    public void who(){
        System.out.println("who() in sub2");
    }
    
}
public class DynDispDemo{
    public static void main(String[] s){
        Sup superOb = new Sup();
        Sub1 sub1Ob = new Sub1();
        Sub2 sub2Ob = new Sub2();
        Sup subRef;
        subRef = superOb;
        subRef.who();
        subRef = sub1Ob;
        subRef.who();
        subRef = sub2Ob;
        subRef.who();

        // the version of who() executed is determined by the type of object being reffered at the time of the call, not by the class type of supRef
    }
}
