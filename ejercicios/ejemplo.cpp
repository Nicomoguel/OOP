class Coche {
private:
    std::string marca;
    int velocidadMaxima;

public:
    Coche(std::string m, int v) {
        marca = m;
        velocidadMaxima = v;
    }
    void mostrarDatos() {
        std::cout << "Coche: " << marca << " | Velocidad Máxima: " << velocidadMaxima << " km/h" << std::endl;
    }

    void acelerar(int incremento) {
        velocidadMaxima += incremento;
    }
};
