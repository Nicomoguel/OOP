import java.io.IOException;
import java.util.Scanner;
public class Menu{
	private int opcion;
	int i = 0;
	CuentaBancaria[] misCuentas = new CuentaBancaria[10];
	Scanner sc = new Scanner(System.in);


	public void Run(){
		int opc;
		do{
			menuPrincipal();
			opc = sc.nextInt();
			switch(opc){
				case 1:
                    System.out.println(" ");
					crearCuenta();
					break;
				case 2:
                    System.out.println(" ");
					ingresarCuenta();
					break;
				case 3:
					opc = 0;
					break;
			}

		}while(opc != 0);
	}

	public int continuar(int cont){
			System.out.print("Deseas continuar? (1 si, 0 no): ");
            cont = sc.nextInt();
            System.out.println(" ");
            return cont;
	}

	public void menuPrincipal(){
		System.out.println("Bienvenido al programa que simula una cuenta bancaria");
		System.out.println("1. Crear una cuenta");
		System.out.println("2. Ingresar usando un numero de cuenta");
		System.out.println("3. Salir del programa");
		System.out.print("Elige una opcion: ");
	}
	public void crearCuenta(){
		int cont = 1;
		do{
			if(i > 9){
				System.out.println("Has llegado al limite de cuentas");
				break;
			}
			System.out.print("Ingrese su nombre: ");
			sc.nextLine();
			String nuevoNombre = sc.nextLine();
			misCuentas[i] = new CuentaBancaria(nuevoNombre);
			System.out.println("Cuenta creada exitosamente");
			System.out.println("Tu numero de cuenta es: " + misCuentas[i].getNumero());
            cont = continuar(cont);
            i++;
			
		}while(cont != 0);
	}
	public void ingresarCuenta(){
		int cont = 1;
		do{
			System.out.print("Ingrese su numero de cuenta: ");
			int nCuenta = sc.nextInt();

			for(int j = 0; j < misCuentas.length; j++){
				if(nCuenta == misCuentas[j].getNumero()){
					System.out.println("Nombre del titular: " + misCuentas[j].getNombre());
					System.out.println("Numero de cuenta: " + misCuentas[j].getNumero());
					System.out.println("Saldo disponible: " + misCuentas[j].consultaSaldo());
                    accionCuenta(misCuentas[j]);
					break;
				}
                else{
                    System.out.println("Cuenta no encontrada.");
                    break;
                }
			}
            cont = continuar(cont);
		}while(cont != 0);
	}
    public void accionCuenta(CuentaBancaria cuenta){
        int monto;
        System.out.println("1. Realizar deposito");
        System.out.println("2. Realizar retiro");
        System.out.println("3. Salir");
        System.out.print("Elige una opcion: ");
        int opc = sc.nextInt();
        if(opc == 1 || opc == 2){
            System.out.println("Ingresa el monto: ");
            monto = sc.nextInt();
            if(opc == 1){
                cuenta.deposito(monto);
            }else if (opc == 2){
                cuenta.retiro(monto);
            }
        }
    }

}
