public class Circulo extends Figura{
    private double r;
    public Circulo(double radio){
        super("Circulo", radio);
        r = radio;
    }

    @Override
    public double getArea(){
        return r * r * Math.PI;
    }
}
