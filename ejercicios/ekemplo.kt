class Coche(val marca: String, val modelo: String, val anio: Int) {

    var kilometraje: Double = 0.0

    fun conducir(distancia: Double) {
        kilometraje += distancia
        println("Has conducido $distancia km. Kilometraje total: $kilometraje km")
    }

    fun obtenerInformacion(): String {
        return "Coche: $marca $modelo del año $anio"
    }
}
