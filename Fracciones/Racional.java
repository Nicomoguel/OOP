public class Racional{
    private int numerador;
    private int denominador;
    public Racional(int nuevoNum, int nuevoDen){
        int comun = gcd(nuevoNum, nuevoDen);
        numerador = nuevoNum / comun;
        denominador = nuevoDen / comun;
    }

    public Racional(){
        numerador = 1;
        denominador = 2;
    }

    public int getNumerador(){
        return numerador;
    }
    public int getDenominador(){
        return denominador;
    }

    private int gcd(int n1, int n2){
        if(n1 < n2){
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }
        int temp;
        while(n2 != 0){
            temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1;
    }

    public Racional suma(Racional obj){
        int resNumerador = (numerador * obj.getDenominador()) + (denominador * obj.getNumerador());
        int resDenominador = denominador * obj.getDenominador();
        return new Racional(resNumerador, resDenominador);
    }
    public Racional resta(Racional obj){
        int resNumerador = (numerador * obj.getDenominador()) - (denominador * obj.getNumerador());
        int resDenominador = denominador * obj.getDenominador();
        return new Racional(resNumerador, resDenominador);
    }
    public Racional multiplicacion(Racional obj){
        int resNumerador = numerador * obj.getNumerador();
        int resDenominador = denominador * obj.getDenominador();
        return new Racional(resNumerador, resDenominador);
    }
    public Racional division(Racional obj){
        int resNumerador = numerador * obj.getDenominador();
        int resDenominador = denominador * obj.getNumerador();
        return new Racional(resNumerador, resDenominador);
    }
    /*
    public void Imprimir(){
        System.out.println("Fraccion: " + numerador + "/" + denominador);
        System.out.println("Numerador: " + numerador);
        System.out.println("Denominador: " + denominador);
        float num1 = (float) numerador;
        float num2 = (float) denominador;
        System.out.println("Formato decimal: " + (num1 / num2));

    }
    */

    public String getFraccionStr(){
        return "Fraccion: " + numerador + "/" + denominador;
    }
    public float getFraccionFloat(){
        float num1 = (float) numerador;
        float num2 = (float) denominador;
        return numerador / denominador;
    }


}
