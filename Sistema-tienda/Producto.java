public class Producto{
    private String nombre;
    private int codigo, stock;
    private double precio;  
    // constructores
    public Producto(String nuevoNombre, int nuevoCodigo){
        nombre = nuevoNombre;
        codigo = nuevoCodigo;
        precio = 0;
        stock = 0;
    }
    public Producto(String nuevoNombre, int nuevoCodigo, int nuevoStock, double nuevoPrecio){
        nombre = nuevoNombre;
        codigo = nuevoCodigo;
        precio = nuevoPrecio;
        stock = nuevoStock;
    }
    public Producto(Producto objCopia){
        nombre = objCopia.getNombre();
        codigo = objCopia.getCodigo();
        precio = objCopia.getPrecio();
        stock = objCopia.getStock();
    }
    // getters
    public String getNombre(){
        return nombre;
    }
    public int getCodigo(){
        return codigo;
    }
    public int getStock(){
        return stock;
    }
    public double getPrecio(){
        return precio;
    }
    //setters
    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }
    public void setCodigo(int nuevoCodigo){
        codigo = nuevoCodigo;
    }
    public void setStock(int nuevoStock){
        stock = nuevoStock;
    }
    public void setPrecio(double nuevoPrecio){
        precio = nuevoPrecio;
    }

}