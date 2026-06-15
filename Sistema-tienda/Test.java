/*
8. Clase Main (demostración)
En el main, demuestra todo: crea productos con los distintos constructores, 
agrégalos con varargs, búscalos con los métodos sobrecargados, muestra el contador estático, 
calcula el total con recursión y registra movimientos con la clase interna. 
Imprime reportes claros en consola.
*/
public class Test{
    public static void main(String[] s){
        Inventario inventario1 = new Inventario(3); // constructor solo con tamaño
        Producto producto1 = new Producto("Sillon", 97203); // constructor nombre + codigo
        producto1.setPrecio(2500);
        producto1.setStock(3);
        Producto producto2 = new Producto("Cama", 97204, 10, 1500); // constructor con todos los datos
        Producto producto3 = new Producto(producto1); // constructor que copia
        inventario1.agregarProducto(producto1); // contructor con 1 producto
        inventario1.agregarVarios(producto2, producto3); // constructor con varios productos
        inventario1.buscarProducto(97204); // busqueda por codigo
        inventario1.buscarProducto("Cama"); // busqueda por nombre
        Producto[] productosEnPresupuesto = inventario1.buscarProducto(1500, 2500);
        if(productosEnPresupuesto.length == 0){
            System.out.println("No hay productos en el rango seleccionado");
        }else{
            System.out.println("Productos encontrados");
            
        }
    }
}