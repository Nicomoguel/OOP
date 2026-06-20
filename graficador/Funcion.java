public class Funcion{
    protected double[] parametros;
    public Funcion(){
        parametros = new double[1];
        parametros[0] = 0.0;
        for(int i = 0; i < parametros.length; i++){
            System.out.println(parametros[i]);
        }
    }
    public Funcion(double[] params){
        parametros = params;
        for(int i = 0; i < parametros.length; i++){
            System.out.println(parametros[i]);
        }
    }
    public double evaluar(double x){
        System.out.println("No implementado");
        return 0.0;
    }
    public String mostrarFuncion(){
        System.out.println("No implementado");
            return null;
    }
}
