public class Test{
    public static void main(String[] s){
        Triangle[] figs = new Triangle[3];
        // default shape
        figs[0] = new Triangle();
        // one parameter shape
        figs[1] = new Triangle(5.0, "One parameter");
        // two parameter shape
        figs[2] = new Triangle(2.0, 3.0, "Two parameters");
        ColorTriangle fig4 = new ColorTriangle("Blue", "Outlined", 8.0, 12.0);
        for(int i = 0; i < figs.length; i++){
            System.out.println("Triangle #" + (i+1));
            figs[i].showStyle();
            System.out.println("Area: " + figs[i].getArea());
        }

        System.out.println("\nMultilevel hierachy: ");
        System.out.println("Triangle #4");
        fig4.showStyle();
        System.out.println("Area: " + fig4.getArea());
        fig4.showColor();  

        ColorTriangle fig5 = new ColorTriangle(fig4);
        System.out.println("\nSuperclass references: ");
        System.out.println("Triangle #5");
        fig5.showStyle();
        System.out.println("Area: " + fig4.getArea());
        fig5.showColor();  
        fig5.showDim();
    }
}
