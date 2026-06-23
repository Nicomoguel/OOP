public class Seno extends Trigonometrica implements Derivable{
    public Seno(double amplitud, double frecuencia, double fase, double ordenada){
        super(amplitud, frecuencia, fase, ordenada);
    }

    @Override
    public Funcion derivar(){
        return new Coseno(this.parametros[0] * this.parametros[1], this.parametros[1], this.parametros[2] + this.parametros[3], 0.0); 
    }

    @Override
    public double evaluar(double x){
        return this.parametros[0] * Math.sin((this.parametros[1] * x) + this.parametros[2]) + this.parametros[3];
    }
    @Override
    public String mostrarFuncion(){
        String seno = "";
        if(this.parametros[0] == 1) seno+="Sen";
        else seno+= this.parametros[0] + "Sen";
        if(this.parametros[1] == 1) seno+="(x";
        else seno += "(" + this.parametros[1] + "x";
        if(this.parametros[2] == 0) seno+=")";
        else seno+= " + " + this.parametros[2] + ")";
        if(this.parametros[3] != 0) seno+= " + " + this.parametros[3];
        return seno;
    }
}
