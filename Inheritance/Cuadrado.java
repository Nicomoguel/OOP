public class Cuadrado extends Figura{
    public Cuadrado(double ... lados){
        super("Cuadrado", lados);
    }
    @Override
    public double getArea(){
        return lados[0] * lados[0];
    }
}
