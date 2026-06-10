public class prueba1{
	public static void main(String args[]){
		System.out.println("Hola mundo");
		Animal leon; // instancia de la clase animal
		leon = new Animal();
		String sonido = leon.hablar();
		String nombreAnimal = leon.getNombre();
		System.out.println(sonido);
		System.out.println(nombreAnimal);
		leon.setNombre("Juan");
		nombreAnimal = leon.getNombre();
		System.out.println("Hello, " + nombreAnimal);
		leon.setPatas(40);
		int patas = leon.getPatas();
		System.out.println(patas);
	}
}
