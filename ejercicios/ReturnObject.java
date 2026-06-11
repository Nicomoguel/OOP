class Err{
    private String error;
    private int level;
    public Err(String newError, int howBad){
        error = newError;
        level = howBad;
    }
    public String getError(){
        return error;
    }
    public int getLevel(){
        return level;
    }
}



class ErrorInfo{
    private String[] s = {"Output error", "Input error", "Disk full", "Index out-of-bounds"};
    private int [] howBad = {3,3,2,4};
    Err getErrorInfo(int i){
        if(i >= 0 & i < s.length) return new Err(s[i], howBad[i]);
        else return new Err("Invalid error code", 0);
    }
}

class ReturnObject{
    public static void main(String[] s){
        ErrorInfo err = new ErrorInfo();
        Err e;
        e = err.getErrorInfo(2);
        System.out.println(e.getError() + " Severity: " + e.getLevel());
        e = err.getErrorInfo(19);
        System.out.println(e.getError() + " Severity: " + e.getLevel());   
    }
}
