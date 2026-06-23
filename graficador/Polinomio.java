public class Polinomio extends Funcion implements Derivable{
    public Polinomio(){
        super();
    }
    public Polinomio(double[] arr){
        super(arr);
    }
    public Polinomio(int[] arr){
        super(arr);
    }
    // implementar derivable
    @Override
    public Polinomio derivar(){
        double[] nuevosParametros = new double[this.parametros.length - 1];
        for(int i = 0; i < nuevosParametros.length; i++){
            nuevosParametros[i] = this.parametros[i+1] * (i + 1);
        }
        Polinomio derivada = new Polinomio(nuevosParametros);
        return derivada;
    }

    //sobre escribo el metodo de la super clase
    @Override
    public double evaluar(double x){
        double resultado = 0;
        for(int i = 0; i <= getGrado(); i++){
            resultado += Math.pow(x, i) * this.parametros[i];
        }
        return resultado;
    }
    @Override    
    public String mostrarFuncion(){
        String polinomio = "";
        if(getGrado()== 0) return polinomio + this.parametros[0];
        for(int i = getGrado(); i > 0; i--){
            String termino = this.parametros[i] + "x^" + i;
            if(this.parametros[i] == 0) continue;
            else if(i == 1 && this.parametros[i] == 1) termino = "x";
            else if(this.parametros[i] == 1) termino = "x^" + i;
            if(i < (getGrado())) polinomio += " + " + termino;
            else polinomio += termino;
        }
        if(this.parametros[0] != 0){
            polinomio += " + " + this.parametros[0];
        }   
        return polinomio;
    }

    public int getGrado(){
        return this.parametros.length -1;
    }

    public double getCoeficiente(int i){
        return this.parametros[i];
    }
}

