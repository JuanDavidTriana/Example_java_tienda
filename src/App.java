import java.util.List;

import Controller.ProductoController;
import Model.Producto;

public class App {
    public static void main(String[] args) throws Exception {
        ProductoController controlador = new ProductoController();

        boolean agregar1 = controlador.agregarProducto("Camisa", 19.99f, "Ropa", 50);
        boolean agregar2 = controlador.agregarProducto("Pantalones", 39.99f, "Ropa", 30);
        boolean agregar3 = controlador.agregarProducto("Zapatos", 59.99f, "Calzado", 20);

        System.out.println("Producto 1 agregado: " + agregar1);
        System.out.println("Producto 2 agregado: " + agregar2);
        System.out.println("Producto 3 agregado: " + agregar3);
 


    }
}
