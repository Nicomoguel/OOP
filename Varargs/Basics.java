
public class Basics{

    static void vaTest(boolean...v){
        System.out.println("vaTest(boolean...v): Number of arguments: " + v.length);
        if(v.length > 0){
            for(int i = 0; i < v.length; i++){
                System.out.println("Argument " + (i + 1) + ": " + v[i]);
            }
        }else System.out.println("None");
        System.out.println();
        
    }

    static void vaTest(int ... v){
        System.out.println("vaTest(int...v): Number of arguments: " + v.length);
        if(v.length > 0){
            for(int i = 0; i < v.length; i++){
                System.out.println("Argument " + (i + 1) + ": " + v[i]);
            }
        }else System.out.println("None");
        System.out.println();
    }

    static void vaTest(String msg, int ... v){ // the variable name parameter must be the last parameter declared by the method and only one varargs parameter is valid
        System.out.println("vaTest(String msj, int..v): " + msg + v.length);
        System.out.println("Contents: ");
        if(v.length > 0){
            for(int i = 0; i < v.length; i++){
                System.out.println("Argument " + (i + 1) + ": " + v[i]);
            }
        }else System.out.println("None");
        System.out.println();
    }

    public static void main(String[] s){
        vaTest("Testing: " ,10, 20);
        vaTest(10, 5, 22, 1);
        vaTest("No varargs: ");
        vaTest(true, false, true);
    }
}
