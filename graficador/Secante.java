
public class Secante extends Trigonometrica{
    public Secante(double amplitud, double frecuencia, double fase, double ordenada){
        super(amplitud, frecuencia, fase, ordenada);
    }
    
    @Override
    public double evaluar(double x){
        return 1 / (this.parametros[0] * Math.cos((this.parametros[1] * x) + this.parametros[2]) + this.parametros[3]);
    }
    @Override
    public String mostrarFuncion(){
        String secante = "";
        if(this.parametros[0] == 1) secante+="Sec";
        else secante+= this.parametros[0] + "Sec";
        if(this.parametros[1] == 1) secante+="(x";
        else secante += "(" + this.parametros[1] + "x";
        if(this.parametros[2] == 0) secante+=")";
        else secante+= " + " + this.parametros[2] + ")";
        if(this.parametros[3] != 0) secante+= " + " + this.parametros[3];
        return secante;
    }
}
