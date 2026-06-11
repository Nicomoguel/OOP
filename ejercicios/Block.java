
class Block{
    private int a, b, c, volume;
    public Block(int newA, int newB, int newC){
        a = newA;
        b = newB;
        c = newC;
        volume = a * b * c;
    }

    public int getVolume(){
        return volume;
    }

    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public int getC(){
        return c;
    }


    public boolean sameBlock(Block block2){
        if(a == block2.getA() & b == block2.getB() & c == block2.getC()) return true;
        return false;
    }

    public boolean sameVolume(Block block2){
        if(volume == block2.getVolume()) return true;
        return false;
    }

}

