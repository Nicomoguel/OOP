import javax.swing.*;
public class operaciones3{
	public static void main(String s[]){
		int n = 3;
		circulo[] circulos = new circulo[3];
		for(int i = 0; i < 3; i++){
			String radio = JOptionPane.showInputDialog("Igresa el radio del circulo " + (i + 1) + ": ");
			double radioDouble = Double.parseDouble(radio);
			circulos[i] = new circulo(radioDouble);
			JOptionPane.showMessageDialog(null, "El area del circulo " + (i + 1) + " es: " + circulos[i].get_area() + "\nEl diametro del circulo " + (i + 1) + " es: "			  + circulos[i].get_diametro() + "\nEl perimetro del circulo " + (i + 1) + " es: " + circulos[i].get_perimetro());
		}
	}
}

