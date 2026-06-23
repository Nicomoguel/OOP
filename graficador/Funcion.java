public abstract class Funcion{
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
    public Funcion(int[] params){
        parametros = new double[params.length];
        for(int i = 0; i < parametros.length; i++){
            parametros[i] = (double) params[i];
        }
    }
    public abstract double evaluar(double x);
    public abstract String mostrarFuncion();
}
