class StaticBlock{
    static double rootOf2;
    static double rootOf3;
    static{
        System.out.println("Inside static block");
        rootOf2 = Math.sqrt(2.0);
        rootOf3 = Math.sqrt(3.0);
    }

    public StaticBlock(String msg){
        System.out.println(msg);
    }
}

class Static{
    public static void main(String[] s){
        StaticBlock ob = new StaticBlock("Inside Constructor");
        //System.out.println("Square root of 2: " + StaticBlock.rootOf2);
        //System.out.println("Square root of 3: " + StaticBlock.rootOf3);
    }
}
