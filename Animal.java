class Animal{ // nombre de la clase

	// atributos
	int npatas;
	String nombre;
	String habitat;

	// metodos de la clase
	String Hablar(){
		//System.out.println("No hablo");
		return "No hablo";
	}

	//getters y setters
	String getNombre(){
		return nombre;
	}

	void setNombre(String nuevoNombre){
		nombre = nuevoNombre;
	}

}
