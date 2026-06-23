public class Coseno extends Trigonometrica{
    public Coseno(double amplitud, double frecuencia, double fase, double ordenada){
        super(amplitud, frecuencia, fase, ordenada);
    }
    
    @Override
    public double evaluar(double x){
        return this.parametros[0] * Math.cos((this.parametros[1] * x) + this.parametros[2]) + this.parametros[3];
    }
    @Override
    public String mostrarFuncion(){
        String coseno = "";
        if(this.parametros[0] == 1) coseno+="Cos";
        else coseno+= this.parametros[0] + "Cos";
        if(this.parametros[1] == 1) coseno+="(x";
        else coseno += "(" + this.parametros[1] + "x";
        if(this.parametros[2] == 0) coseno+=")";
        else coseno+= " + " + this.parametros[2] + ")";
        if(this.parametros[3] != 0) coseno+= " + " + this.parametros[3];
        return coseno;
    }
}
