

class prueba2{
	public static void main(String args[]){
		Gato gato1 = new Gato();
		gato1.set_patas(4);
		gato1.set_sonido("Meow");
		gato1.set_cola(true);
		int patas = gato1.get_npatas();
		String sonido = gato1.get_sonido();
		boolean cola = gato1.get_cola();
		System.out.println(sonido);
		System.out.println(patas);
		System.out.println("El gato " + (cola ? "si" : "no") + " tiene cola");
	}	
	
}
