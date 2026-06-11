import java.util.Random;
public class CuentaBancaria{
	private String nombre;
	private int numeroCuenta;
	private int saldoDisponible;
	public CuentaBancaria(String nuevoNombre){
		nombre = nuevoNombre;
		Random rand = new Random();
		numeroCuenta = 12345 + rand.nextInt(99999);
		saldoDisponible = 0;
	}

	public String getNombre(){
		return nombre;
	}

	public int getNumero(){
		return numeroCuenta;
	}
	public int consultaSaldo(){
		return saldoDisponible;
	}
	public void deposito(int cantidad){
		saldoDisponible += cantidad;
	}
	public void retiro(int cantidad){
		saldoDisponible -= cantidad;
	}
}
