public class prueba{
	public static void main(String args[]){
		System.out.println("Hola mundo");
		Animal leon; // instancia de la clase animal
		leon = new Animal(); // inicializacion
		String sonido = leon.Hablar(); // guardamos la cadena de caracteres
		String nombreAnimal = leon.getNombre();
		System.out.println(sonido);
		leon.setNombre("Juan");
		nombreAnimal = leon.getNombre();
		System.out.println(nombreAnimal);
	}
}
