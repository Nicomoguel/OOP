public class Triangle extends TwoDShape{
    String style;
    public Triangle(){
        super();
        style = "Default";
    }
    public Triangle(double x, String newStyle){
        super(x);
        style = newStyle;
    }
    public Triangle(double x, double y, String newStyle){
        super(x,y);
        style = newStyle;
    }

    public Triangle(Triangle ob){
        super(ob);
        style = ob.getStyle();
    }
    
    public double getArea(){
        return getWidth() * getHeigth() / 2;
    }
    public String getStyle(){
        return style;
    }
    public void showStyle(){
        System.out.println("Style is: " + style);
    }
}   
