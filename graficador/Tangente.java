public class Tangente extends Trigonometrica{
    private Seno seno;
    private Coseno coseno;
    public Tangente(double amplitud, double frecuencia, double fase, double ordenada){
        super(amplitud, frecuencia, fase, ordenada);
        seno = new Seno(amplitud, frecuencia, fase, ordenada);
        coseno = new Coseno(amplitud, frecuencia, fase, ordenada);
    }
    @Override
    public double evaluar(double x){
        double resultado = seno.evaluar(x) / coseno.evaluar(x);
        return resultado;
    }
    @Override
    public String mostrarFuncion(){
        String tangente = "";
        if(this.parametros[0] == 1) tangente+="Tan";
        else tangente+= this.parametros[0] + "Tan";
        if(this.parametros[1] == 1) tangente+="(x";
        else tangente += "(" + this.parametros[1] + "x";
        if(this.parametros[2] == 0) tangente+=")";
        else tangente+= " + " + this.parametros[2] + ")";
        if(this.parametros[3] != 0) tangente+= " + " + this.parametros[3];
        return tangente;
    }
}
