public class Inventario{
    private Producto[] productos;
    private int contador;
    private static int contadorGlobal = 0;


    static{
        System.out.println("Sistema de inventario inicializado.");
    }

    public Inventario(int maxSize){
        productos = new Producto[maxSize];
        contador = 0;
    }
    public Inventario(){
        productos = new Producto[50];
        contador = 0;
    }   
    public void agregarProducto(Producto obj){
        if(contador == productos.length){
            System.out.println("Has llegado al limite del inventario");
        }else{
            productos[contador++] = obj;
            contadorGlobal += obj.getStock();
        }
    }

    public void agregarVarios(Producto ... nuevosProductos){
        if(contador == productos.length){
            System.out.println("Has llegado al limite del inventario");
            return;
        }else{
            for(int i = 0; i < nuevosProductos.length; i++){
                if(contador == productos.length){
                    System.out.println("Has llegado al limite del inventario");
                    return;
                }   
                productos[contador++] = nuevosProductos[i];
                contadorGlobal += nuevosProductos[i].getStock();
            }
        }
    }


    public void buscarProducto(int codigo){
        for(int i = 0; i < contador; i++){
            if(productos[i].getCodigo() == codigo){
                System.out.println("Producto encontrado");
                System.out.println("Producto: " + productos[i].getNombre());
                System.out.println("Codigo: " + productos[i].getCodigo());
                System.out.println("Precio: " + productos[i].getPrecio());
                System.out.println("En stock: " + productos[i].getStock());
                return;
            }
        }
        System.out.println("No se encontro el producto");
    }
    /*
    public Producto buscarProducto(int codigo){
            for(int i = 0; i < contador; i++){
                if(productos[i].getCodigo() == codigo){
                    return productos[i];
                }
            }
            return null;
    }
    */
    public void buscarProducto(String nombre){
        for(int i = 0; i < contador; i++){
            if(productos[i].getNombre().equals(nombre)){
                System.out.println("Producto encontrado");
                System.out.println("Producto: " + productos[i].getNombre());
                System.out.println("Codigo: " + productos[i].getCodigo());
                System.out.println("Precio: " + productos[i].getPrecio());
                System.out.println("En stock: " + productos[i].getStock());
                return;
            }
        }
        System.out.println("No se encontro el producto");
    }

    public Producto[] buscarProducto(double min, double max){
        int size = 0;
        for(int i = 0; i < productos.length; i++){
            double precio = productos[i].getPrecio();
            if(precio <= max && precio >= min) size++;
        }
        Producto[] productosEnRango = new Producto[size];
        int contador = 0;
        for(int i = 0; i < productos.length; i++){
            double precio = productos[i].getPrecio();
            if(precio <= max && precio >= min){
                productosEnRango[contador++] = productos[i];
            }
        }
        return productosEnRango;
    }

    public Producto buscarProductoIndex(int index){
        return productos[index];
    }

    static int getContadorGlobal(){
        return contadorGlobal;
    }

    public int getSize(){
        return productos.length;
    }

    public double getValorTotal(int size){ // el size seria llamado por getSize() - 1
        if(size == -1){
            return 0;
        }
        return productos[size].getPrecio() + getValorTotal(size - 1);
    }


    public static Inventario merge(Inventario inv1, Inventario inv2){
        int size = inv1.getSize() + inv2.getSize();
        Inventario nuevoInventario = new Inventario(size);
        for(int i = 0; i < inv1.getSize(); i++){
            nuevoInventario.agregarProducto(inv1.buscarProductoIndex(i));
        }
        for(int i = 0; i < inv2.getSize(); i++){
            nuevoInventario.agregarProducto(inv2.buscarProductoIndex(i));
        }
        return nuevoInventario;
    }


    public void registro(){
        Movimiento obj = new Movimiento();
        obj.registroTotal();
        obj.ultimoAgregado();
    }


    class Movimiento{
        void registroTotal(){
            System.out.println("Registro del inventario: ");
            System.out.println();
            for(int i = 0; i < contador; i++){
                System.out.println("Producto #" + (i + 1) + ": " + productos[i].getNombre());
                System.out.println("Codigo: " + productos[i].getCodigo());
                System.out.println("Precio: " + productos[i].getPrecio());
                System.out.println("En stock: " + productos[i].getStock());
            }
        }
        void ultimoAgregado(){
            System.out.println();
            System.out.println("Ultimo producto agregado: " + productos[contador - 1].getNombre());
            System.out.println("Codigo: " + productos[contador - 1].getCodigo());
            System.out.println("Precio: " + productos[contador - 1].getPrecio());
            System.out.println("En stock: " + productos[contador - 1].getStock());
        }
    }

}
