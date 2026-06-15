public class Stack{
    private int[] stck;
    private int index, last;
    public Stack(int num){
        stck = new int[num];
        index = last = 0;
    }
    public Stack(Stack obj){
        stck = new int[obj.getLength()];
        index = 0;
        last = obj.getLength();
        stck = obj.getStack();
    }
    public Stack(int[] arr){
        stck = new int[arr.length];
        stck = arr;
        index = 0; 
        last = arr.length;
    }

    public int getIndex(){
        return index;
    }

    public int getLast(){
        return last;
    }

    public int getLength(){
        return stck.length;
    }

    public int[] getStack(){
        return stck;
    }

    public void push(int val){
        if(last < stck.length){
            stck[last++] = val;
        }else{
            System.out.println("Stack is full");   
        }
    }

    public int pop(){
        if(last >= index){
            return stck[--last];
        }else{
            return 0;
        }
    }
}
