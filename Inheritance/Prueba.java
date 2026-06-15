public class Prueba{
    public static void main(String[] s){
        double[] ladosTriangulo = {3.0, 2.5, 5.0};
        double[] ladosCuadrado = {5.0,5.0,5.0,5.0};
        Figura triangulo = new Triangulo(3.0, 2.5, 5.0);
        Figura cuadrado = new Cuadrado(5.0, 5.0, 5.0, 5.0);
        Figura rectangulo = new Rectangulo(4.0, 2.1, 4.0, 2.1);
        Figura circulo = new Circulo(1.0);
        Figura[] figuras = {triangulo, cuadrado, rectangulo, circulo};
        
        for(int i = 0; i < figuras.length; i++){
            System.out.println("Figura: " + figuras[i].getNombre());
            System.out.println("Perimetro: " + figuras[i].getPerimetro());
            System.out.println("Area: " + figuras[i].getArea());
            System.out.println();
        }
    }
}
