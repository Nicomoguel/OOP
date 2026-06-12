class Sum{
    private int sum;
    public Sum(int i){
        sum += i*(i+1)/2;
    }

    public Sum(Sum obj){
        sum = obj.getSum();
    }


    public int getSum(){
        return sum;
    }
}

class objectInitialize{
    public static void main(String[] s){
        Sum s1 = new Sum(10);
        Sum s2 = new Sum(s1);

        System.out.println("Summation of s1: " + s1.getSum());
        System.out.println("Summation of s2: " + s2.getSum());

    }
}
