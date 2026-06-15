class Test{
    static int sum(int ... args){
        int sm = 0;
        for(int i = 0; i < args.length; i++){
            sm += args[i];
        }
        return sm;
    }
    // ambiguous constructor
    static int sum(int a, int ... args){
        int sm = a; 
        for(int i = 0; i < args.length; i++){
            sm += args[i];
        }
        return sm;
    }
    
}

public class VarargsSum{
    public static void main(String[] s){
        int suma = Test.sum(10, 20, 30, 40, 50, 60);
        System.out.println(suma);
    }
}
