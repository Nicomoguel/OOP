public class Queue{
    private int[] q;
    private int putloc, getloc;
    // constructor que recibe un numero y crea una cola vacia
    public Queue(int num){
        q = new int[num];
        putloc = getloc = 0;
    }
    public Queue(Queue obj){
        q = new int[obj.getLength()];
        putloc = obj.getPutloc();
        getloc = obj.getGetloc();
        for(int i = 0; i < obj.getLength(); i++){
            q[i] = obj.getQAt(i);
        }
    }

    public Queue(int[] arr){
        putloc = 0;
        getloc = 0;
        q = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            put(arr[i]);
        }
    }

    public int getPutloc(){
        return putloc;
    }
    public int getGetloc(){
        return getloc;
    }
    public int getQAt(int i){
        return q[i];
    }
    public int getLength(){
        return q.length;
    }

    public void put(int num){
        if(putloc == q.length){
            System.out.println("Queue is full");
            return;
        }
        q[putloc++] = num;
    }

    public int get(){
        if(getloc == putloc){
            return 0;
        }
        return q[getloc++];

    }
}

