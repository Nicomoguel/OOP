public class Test{
    public static void main(String[] s){
        Triangle[] figs = new Triangle[3];
        // default shape
        figs[0] = new Triangle();
        // one parameter shape
        figs[1] = new Triangle(5.0, "One parameter");
        // two parameter shape
        figs[2] = new Triangle(2.0, 3.0, "Two parameters");
        for(int i = 0; i < figs.length; i++){
            System.out.println("Triangle #" + (i+1));
            figs[i].showStyle();
            System.out.println("Area: " + figs[i].getArea());
        }
    }
}
