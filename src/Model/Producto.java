package Model;

public class Producto {
    /*Producto 
    •	ID
    •	Nombre
    •	Precio
    •	Categoría
    •	Stock
 */
    private int id;
    private String nombre;
    private float precio;
    private String categorias;
    private int Stock;

    public Producto() {
    }

    public Producto(int id, String nombre, float precio, String categorias, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.categorias = categorias;
        Stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getCategorias() {
        return categorias;
    }

    public void setCategorias(String categorias) {
        this.categorias = categorias;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        Stock = stock;
    }

    @Override
    public String toString() {
        return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", categorias=" + categorias
                + ", Stock=" + Stock + "]";
    }

    

    
}
