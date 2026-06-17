public class Vehicle{
    private int pasajeros;
    private int galonesGas;
    private int consumoMillas;
    public Vehicle(int nuevosPasajeros, int nuevoGalones, int nuevoConsumo){
        pasajeros = nuevosPasajeros;
        galonesGas = nuevoGalones;
        consumoMillas = nuevoConsumo;
    }   
    public int autonomia(){
        return galonesGas * consumoMillas;
    }
    public float gasNecesario(int distancia){
        float dist = (float) distancia;
        return dist / consumoMillas;
    }
    public int getPasajeros(){
        return pasajeros;
    }
    public int getGalones(){
        return galonesGas;
    }
    public int getConsumo(){
        return consumoMillas;
    }
    public void setPasajeros(int num){
        pasajeros = num;
    }
    public void setGalones(int num){
        galonesGas = num;
    }
    public void setConsumo(int num){
        consumoMillas = num;
    }
}
