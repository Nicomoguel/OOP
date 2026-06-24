import java.util.PriorityQueue;
class Task implements Comparable<Task>{
    public String name;
    public int priority;
    public Task(String name, int priority){
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(Task other){
        return Integer.compare(this.priority, other.priority);
    }
    @Override
    public String toString(){
        return name + " (Prioridad: " + priority + ")";
    }

}

public class Tasks{
    public static void main(String[] s){
        PriorityQueue<Task> tasks = new PriorityQueue<>();
        tasks.add(new Task("Lavar la ropa", 5));
        tasks.add(new Task("Pasear al perro", 3));
        tasks.add(new Task("Comer", 1));
        while(!tasks.isEmpty()){
            System.out.println("Haciendo: " + tasks.poll());
        }
    }
}
