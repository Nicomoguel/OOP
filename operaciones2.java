import javax.swing.*;
public class operaciones2{
	public static void main(String s[]){
		calculadora calc = new calculadora();
		calculadora calc2;
		String str1 = JOptionPane.showInputDialog("Ingresa el primer valor: ");
		String str2 = JOptionPane.showInputDialog("Ingresa el segundo valor: ");
	       	int n1 = Integer.parseInt(str1);
		int n2 = Integer.parseInt(str2);
		calc2 = new calculadora(n1, n2);	
	}
}
