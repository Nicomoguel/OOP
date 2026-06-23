public class PruebaFuncion{
    public static void main(String[] s){
/*        Funcion funcion1 = new Funcion();
        double valor = funcion1.evaluar(2.5);
        String fun1 = funcion1.mostrarFuncion();
        double[] coeficientes = {3.2, 3.5, 8.6};
        Funcion funcion2 = new Polinomio(coeficientes);
        double valor2 =  funcion2.evaluar(4.5);
        System.out.println(funcion2.mostrarFuncion());
  */
        double[] coef = {1,3,2};
        Funcion polinomio = new Polinomio(coef);
        double resP1 = polinomio.evaluar(3.5);
        System.out.println("El resultado es: " + resP1);
        //pruebas derivada 
        double[] coef2 = {-3,10,1-3-5};
        Polinomio p3 = new Polinomio(coef2);
        Polinomio derivada_p3 = p3.derivar();
        String sp3 = p3.mostrarFuncion();
        System.out.println("Funcion: " + sp3);
        sp3 = derivada_p3.mostrarFuncion();
        System.out.println("Funcion derivada: " + sp3);
        for(int i = 1; derivada_p3.getGrado() >= 0; i++){
            System.out.println("La " + i + "-derivada es: " + derivada_p3.mostrarFuncion());
            derivada_p3 = derivada_p3.derivar();
        }


    }
}
