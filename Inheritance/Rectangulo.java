public class Rectangulo extends Figura{
    public Rectangulo(double ... lados){
        super("Rectangulo", lados);
    }
    public double getArea(){
        return lados[0] * lados[1];
    }
}
