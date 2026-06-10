public class Gato{
	// atributos
	private int numPatas;
	private String sonido;
	private boolean tieneCola;
	// Metodos
	public void set_patas(int num){
		numPatas = num;
	}
	public void set_sonido(String nuevo_sonido){
		sonido = nuevo_sonido;
	}
	public void set_cola(boolean valor){
		tieneCola = valor;
	}	
	
	public String get_sonido(){
		return sonido;
	}
	public int get_npatas(){
		return numPatas;
	}
	public boolean get_cola(){
		return tieneCola;
	}
}
