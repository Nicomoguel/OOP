public class Funcion{
    private double[] parametros;
    private int grado;
    public Funcion(){
        this.parametros = new double[1];
        parametros[0] = 0.0;
        System.out.println("Este es el constructor sin argumentos");
        for(int i = 0; i < this.parametros.length; i++){
            System.out.println(this.parametros[i]);
        }
    }
    public Funcion(double[] params){
        this.parametros = params;
        System.out.println("Este es el constructor con argumentos");   
        for(int i = 0; i < this.parametros.length; i++){
            System.out.println(this.parametros[i]);
    }
}
