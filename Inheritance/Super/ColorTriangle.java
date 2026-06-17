public class ColorTriangle extends Triangle{
    private String color;
    public ColorTriangle(String c, String s, double x, double y){
        super(x,y,s);
        color = c;
    }
    public String getColor(){
        return color;
    }
    public void showColor(){
        System.out.println("Color is " + color);
    }

}
