
public class Cosecante extends Trigonometrica{
    public Cosecante(double amplitud, double frecuencia, double fase, double ordenada){
        super(amplitud, frecuencia, fase, ordenada);
    }
    @Override
    public double evaluar(double x){
        return 1 / (this.parametros[0] * Math.sin((this.parametros[1] * x) + this.parametros[2]) + this.parametros[3]);
    }
    @Override
    public String mostrarFuncion(){
        String cosecante = "";
        if(this.parametros[0] == 1) cosecante+="Csc";
        else cosecante+= this.parametros[0] + "Csc";
        if(this.parametros[1] == 1) cosecante+="(x";
        else cosecante += "(" + this.parametros[1] + "x";
        if(this.parametros[2] == 0) cosecante+=")";
        else cosecante+= " + " + this.parametros[2] + ")";
        if(this.parametros[3] != 0) cosecante+= " + " + this.parametros[3];
        return cosecante;
    }
}
