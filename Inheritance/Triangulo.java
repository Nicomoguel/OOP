public class Triangulo extends Figura{
    public Triangulo(double ... lados){
        super("Triangulo", lados);
    }

    @Override
    public double getArea(){
        double sPerimetro = (lados[0] + lados[1] + lados[2]) / 2;
        double area = Math.sqrt(sPerimetro*(sPerimetro - lados[0])*(sPerimetro - lados[1])*(sPerimetro - lados[2])); 
        return area;

    }

}
