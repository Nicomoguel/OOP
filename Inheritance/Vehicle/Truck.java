public class Truck extends Vehicle{
    private int capCarga;
    public Truck(int pasajeros, int combustible, int consumo, int capacidad){
        super(pasajeros, combustible, consumo);
        capCarga = capacidad;
    }
    public int getCapacidad(){
        return capCarga;
    }
    public void setCapacidad(int num){
        capCarga = num;
    }
}
