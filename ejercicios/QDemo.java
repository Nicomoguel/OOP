class Queue{
    private char[]q;
    private int putloc, getloc;
    Queue(int size){
        q = new char[size];
        putloc = getloc = 0;
    }
    public void put(char ch){
        if(putloc == q.length){
            System.out.println("Queue is full");
            return;
        }
        q[putloc++] = ch;
    }
    public char get(){
        if(getloc == putloc){
            System.out.println("Queue is empty");
            return '0';
        }
        return q[getloc++];
    }
}
public class QDemo{
    public static void main(String[] s){
        Queue queue1 = new Queue(100);
        Queue queue2 = new Queue(4);
        
        for(int i = 0; i < 26; i++){
            queue1.put((char) ('A' + i));
        }
        for(int i = 0; i < 26; i++){
            char c = queue1.get();
            if(c != (char) 0) System.out.print(c);
        }
        System.out.println("\n");
        System.out.println("Using queue2 to generate some errors");
        for(int i = 0; i < 5; i++){
            System.out.println("Trying to store " + (char)('Z' - i));
            queue2.put((char)('Z'-i));
            System.out.println();
        }
        System.out.println();
        System.out.println("Contents of queue2");
        for(int i =0; i <5;i++){
            char c = queue2.get();
                if(c != '0') System.out.print(c + " ");
        }
    }
}
