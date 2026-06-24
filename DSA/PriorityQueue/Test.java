import java.util.PriorityQueue;
import java.util.Comparator;
public class Test{
    public static void main(String[] s){
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        // hacer que la prioridad de la cola sea inversa
        

        // agregar elementos
        queue.add(5);
        queue.add(3);
        queue.add(1);
        // ver elemento con mayor prioridad
        System.out.println("Elemento con mayor prioridad: " + queue.peek());
        // eliminar elementos con mayor prioridad
        //System.out.println("Eliminado: " + queue.poll());
        // imprimir la cola
        while(!queue.isEmpty()) System.out.println(queue.poll());
    }
}
