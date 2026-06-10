import javax.swing.*;
public class operaciones{
	public static void main(String args[]){
		calculadora nueva_calc = new calculadora();
		
		String str1 = JOptionPane.showInputDialog("Ingresa el primer numero: ");
		String str2 = JOptionPane.showInputDialog("Ingresa el segundo numero: ");
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		nueva_calc.set_nums(num1, num2);
		int suma = nueva_calc.suma();
		int resta = nueva_calc.resta();
		int multiplicacion = nueva_calc.multiplicacion();
		int division = nueva_calc.division();
		String mayor = nueva_calc.mayor();
		JOptionPane.showMessageDialog(null, "La suma es: " + suma);
		JOptionPane.showMessageDialog(null, "La resta es: " + resta);
		JOptionPane.showMessageDialog(null, "La multiplicacion es: " + multiplicacion);
		JOptionPane.showMessageDialog(null, "La division es: " + division);
		JOptionPane.showMessageDialog(null, mayor);
				
	}
}
