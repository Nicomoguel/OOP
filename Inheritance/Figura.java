public class Figura{
    protected double[] lados; 
    protected int numLados;
    protected String nombre;
    
    public Figura(String nombreFigura, double ... cadaLado){
        this.nombre = nombreFigura;
        this.lados = new double[cadaLado.length];
        this.lados = cadaLado;
        this.numLados = this.lados.length;
    }

    public int getLados(){
        return this.numLados;
    }

    public String getNombre(){
        return this.nombre;
    }

    public double getArea(){
        System.out.println("No implementado");
        return 0;
    }
    public double getPerimetro(){
        double sum = 0;
        for(int i = 0; i < numLados; i++){
            sum += lados[i];
        }
        return sum;
    }
}
