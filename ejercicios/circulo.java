public class circulo{
	private double radio;
	private final double pi = 3.14159;
	public circulo(){
		radio = 1.0;
	}
	public circulo(double new_radio){
		radio = new_radio;
	}

	public double get_area(){
		return pi * radio * radio;
	}
	public double get_diametro(){
		return 2 * radio;
	}
	public double get_perimetro(){
		return get_diametro() * pi;
	}	




}
