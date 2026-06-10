import javax.swing.*;
class interfaz{
	public static void main(String args[]){
		JOptionPane.showMessageDialog(null, "Hola desde una ventana");
		String name =  JOptionPane.showInputDialog(null, "Ingresa tu nombre");
		JOptionPane.showMessageDialog(null, "Hola, " + name);
	}
}
