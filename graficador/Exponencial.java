public class Exponencial extends Funcion{
    public Exponencial(double base, double exponente, double constante){
        super(new double[]{base,exponente,constante});
    }
    @Override
    public double evaluar(double x){
        return Math.pow(this.parametros[0], x * this.parametros[1]) + this.parametros[2];
    }
    @Override
    public String mostrarFuncion(){
        String exp = "";
        if(this.parametros[0] == Math.E) exp+= "e";
        else exp += String.valueOf(this.parametros[0]);
        if(this.parametros[1] != 1) exp += "^(" +this.parametros[1] + "x)";
        else exp += "^x";
        if(this.parametros[2] != 0) exp += " + " + this.parametros[2];
        return exp;
    }
}
