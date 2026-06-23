public abstract class Employee{  
    protected String name;
    protected String ID;
    public Employee(String name, String ID){
        this.name = name;
        this.ID = ID;
    }
    public Employee(Employee ob){
        this.name = ob.name();
        this.ID = ob.ID();
    }   
    public abstract double getSalary();
    public String getName(){return this.name;}
    public String getID(){return this.ID;}

}
