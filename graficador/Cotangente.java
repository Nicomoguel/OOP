public class Cotangente extends Trigonometrica{
    private Seno seno;
    private Coseno coseno;
    public Cotangente(double amplitud, double frecuencia, double fase, double ordenada){
        super(amplitud, frecuencia, fase, ordenada);
        seno = new Seno(amplitud, frecuencia, fase, ordenada);
        coseno = new Coseno(amplitud, frecuencia, fase, ordenada);
    }
    @Override
    public double evaluar(double x){
        double resultado = coseno.evaluar(x) / seno.evaluar(x);
        return resultado;
    }
    @Override
    public String mostrarFuncion(){
        String cotangente = "";
        if(this.parametros[0] == 1) cotangente+="Cot";
        else cotangente+= this.parametros[0] + "Cot";
        if(this.parametros[1] == 1) cotangente+="(x";
        else cotangente += "(" + this.parametros[1] + "x";
        if(this.parametros[2] == 0) cotangente+=")";
        else cotangente+= " + " + this.parametros[2] + ")";
        if(this.parametros[3] != 0) cotangente+= " + " + this.parametros[3];
        return cotangente;
    }
}
