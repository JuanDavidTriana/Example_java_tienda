package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.Producto;

public class ProductoController {
    /* 
    Agregar Producto (Producto)-> Bool
    Buscar Todos los Productos ()-> Lista(Prod)
    Actualizar un producto (ID, Producto) -> Bool
    Eliminar un Producto (ID) -> Bool
    Validad Stock (ID) -> Producto(Stock)
    Filtro por Atributo (Atributo)-> Lista(Productos)
    Modificar un atributo en especifico (ID, Atributo) -> Bool
    */

    private List<Producto> productos;
    private int id = 1;

    public ProductoController() {
        this.productos = new ArrayList<>();
    }

    
    public Boolean agregarProducto(String nombre, float precio, String categorias, int stock){

        //Validacion basica
        if (nombre == null || nombre.trim().isEmpty()){
            return false;
        }

        if (precio <= 0){
            return false;
        }

        if (stock < 0){
            return false;
        }

        //Crear un nuevo producto
        Producto productoNuevo = new Producto(id,nombre, precio, categorias, stock);

        boolean agregar = productos.add(productoNuevo);

        if (agregar) id++;

        return agregar;
    }

    
}
