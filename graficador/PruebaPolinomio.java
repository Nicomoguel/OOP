public class PruebaPolinomio{
    public static void main(String[] s){
        Polinomio p1, p2, p3;
        int[] coeficientes1 = {1,2,3,4,5,6,7,8,9,10};
        int[] coeficientes2 = {3,6,9};
        int[] coeficientes3 = {2,1,3};
        p1 = new Polinomio(coeficientes1);
        p2 = new Polinomio(coeficientes2);
        p3 = new Polinomio(coeficientes3);

        System.out.println("El grado del polinomio 1 es: " + p1.getGrado());
        System.out.println("El grado del polinomio 2 es: " + p2.getGrado());
        System.out.println("El grado del polinomio 3 es: " + p3.getGrado());
            
        double resultado3 = p3.evaluar(3);
        double resultado2 = p2.evaluar(6);
        double resultado1 = p1.evaluar(9);

        p3.mostrarPolinomio(3);
        p2.mostrarPolinomio(6);
        p1.mostrarPolinomio(9);


    }


}

