import java.util.Scanner;
public class Menu{
    Scanner sc = new Scanner(System.in); 

    public void run(){
        int cont = 1;
        while(cont != 0){
            int opc;
            menu();
            opc = sc.nextInt();
            while(1 > opc || 5 < opc){
                System.out.print("Ingresa una opcion valida: ");
                opc = sc.nextInt();
            }
            switch(opc){
                case 1:
                    opc1();
                    break;
                case 2:
                    opc2();
                    break;
                case 3:
                    opc3();
                    break;
                case 4:
                    opc4();
                    break;
                case 5:
                    cont = 0;
                    break;
            }
        }
    }


    private void menu(){
        System.out.println("Operaciones con fracciones");
        System.out.println("1. Suma de fracciones");
        System.out.println("2. Resta de fracciones");
        System.out.println("3. Multiplicacion de fracciones");
        System.out.println("4. Division de fracciones");
        System.out.println("5. Salir del programa");
        System.out.println("Elige una opcion: ");
    }
    private void opc1(){
        System.out.println();
        Racional[] numeros = ingresarNums();
        Racional resultado = numeros[0].suma(numeros[1]);
        System.out.println("Resultado de la suma");
        Imprimir(resultado);
    }
    private void opc2(){
        System.out.println();
        Racional[] numeros = ingresarNums();
        Racional resultado = numeros[0].resta(numeros[1]);
        System.out.println("Resultado de la resta");
        Imprimir(resultado);
    }
    private void opc3(){
        System.out.println();
        Racional[] numeros = ingresarNums();
        Racional resultado = numeros[0].multiplicacion(numeros[1]);
        System.out.println("Resultado de la multiplicacion");
        Imprimir(resultado);
    }
    private void opc4(){
        System.out.println();
        Racional[] numeros = ingresarNums();
        Racional resultado = numeros[0].division(numeros[1]);
        System.out.println("Resultado de la multiplicacion");
        Imprimir(resultado);
    }

    private void Imprimir(Racional obj){
        String racional = obj.getFraccionStr();
        float decimal = obj.getFraccionFloat();
        System.out.println(racional);
        System.out.println("Formato decimal: " + decimal);
        System.out.println("Numerador: " + obj.getNumerador());
        System.out.println("Denominador: " + obj.getDenominador());
    }

    private Racional[] ingresarNums(){
        int num1, num2;
        Racional[] numeros = new Racional[2];
        for(int i = 0; i < 2; i++){
            System.out.print("Ingresa el numerador del numero " + (i+1) + ": ");
            num1 = sc.nextInt();
            System.out.print("Ingresa el denominador del numero " + (i+1) + ": ");
            num2 = sc.nextInt();
            numeros[i] = new Racional(num1, num2);
        }
        return numeros;
    }
}
