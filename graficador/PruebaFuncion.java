public class PruebaFuncion{
    public static void main(String[] s){
        Funcion funcion1 = new Funcion();
        double valor = funcion1.evaluar(2.5);
        String fun1 = funcion1.mostrarFuncion();
        double[] coeficientes = {3.2, 3.5, 8.6};
        Funcion funcion2 = new Polinomio(coeficientes);
        double valor2 =  funcion2.evaluar(4.5);
        System.out.println(funcion2.mostrarFuncion());
    }
}
