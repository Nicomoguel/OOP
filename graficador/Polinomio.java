public class Polinomio{
    private int[] coeficientes;
    private int grado; 
    public Polinomio(int[] arr){
        grado = arr.length;
        coeficientes = arr;
    }
    public double evaluar(double x){
        double resultado = 0;
        for(int i = 0; i < grado; i++){
            resultado += Math.pow(x, i) * coeficientes[i];
        }
        return resultado;
    }
    
    public void mostrarPolinomio(double x){
        for(int i = grado - 1; i >= 0; i--){
            if(i == 0){
                
                System.out.print(coeficientes[i] + "(" + x + ")^" + i + ": " + evaluar(x));


            }else{
                System.out.print(coeficientes[i] + "(" + x + ")^" + i + " + ");
            }
        }
        System.out.println();
    }

    public int getGrado(){
        return grado;
    }

    public int getCoeficiente(int i){
        return coeficientes[i];
    }
}

