public class TruckDemo{
    public static void main(String[] s){
        Truck trailer = new Truck(2, 200, 7, 44000);
        Truck camioneta = new Truck(3, 28, 15, 2000);
        int distancia = 252;
        float dist1 = trailer.gasNecesario(distancia);
        float dist2 = camioneta.gasNecesario(distancia);
        System.out.println("Semi can carry " + trailer.getCapacidad());
        System.out.println("To go " + distancia + " miles semi needs " + dist1 + " galloons of fuel");
        System.out.println("To go " + distancia + " miles pickup needs " + dist2 + " galloons of fuel");
    }
}
