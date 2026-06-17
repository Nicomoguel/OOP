public class TwoDShape{
    private double width;
    private double heigth;
    public TwoDShape(){
        width = heigth = 0.0;
    }
    public TwoDShape(double x){
        width = heigth = x;
    }
    public TwoDShape(double x, double y){
        width = x;
        heigth = y;
    }

    public double getWidth(){return width;}
    public double getHeigth(){return heigth;}
    public void setWidth(double newWidth){width = newWidth;}
    public void setHeigth(double newHeigth){heigth = newHeigth;}
    public void showDim(){
        System.out.println("Width: " + width);
        System.out.println("Heigth: " + heigth);
    }
}
