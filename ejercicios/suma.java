import javax.swing.*;
class suma{
	public static void main(String args[]){
		JOptionPane.showMessageDialog(null, "Este programa solicita dos numeros y calcula su suma");
		String s1 = JOptionPane.showInputDialog(null, "Ingrese el primer numero");
		String s2 = JOptionPane.showInputDialog(null, "Ingrese el segundo numero");
		int n1 = Integer.parseInt(s1);
		int n2 = Integer.parseInt(s2);
		int sum = n1 + n2;
		JOptionPane.showMessageDialog(null, "La suma de " + n1 + " y " + n2 + " es: " + sum);
		int res = n1 - n2;
		JOptionPane.showMessageDialog(null, "La resta de " + n1 + " y " + n2 + " es: " + res);
		int mult = n1 * n2;
		JOptionPane.showMessageDialog(null, "La multiplicacion de " + n1 + " y " + n2 + " es: " + mult);
		int div = n1 / n2;
		JOptionPane.showMessageDialog(null, "La division de " + n1 + " y " + n2 + " es: " + div);
	}	
}
