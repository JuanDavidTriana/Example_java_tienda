# 📦 Sistema de Gestión de Productos y Ventas

Este proyecto permite administrar productos y llevar un historial de ventas con operaciones básicas como agregar, actualizar, eliminar y validar stock.  

---

## 🛒 Entidad: Producto

### Atributos
- **ID**
- **Nombre**
- **Precio**
- **Categoría**
- **Stock**

### Operaciones
- `Agregar Producto (Producto) -> Bool`  
- `Buscar Todos los Productos () -> Lista<Producto>`  
- `Actualizar Producto (ID, Producto) -> Bool`  
- `Eliminar Producto (ID) -> Bool`  
- `Validar Stock (ID) -> Stock`  
- `Filtrar por Atributo (atributo, valor) -> Lista<Producto>`  
- `Modificar Atributo Específico (ID, atributo, valor) -> Bool`  

---

## 📑 Entidad: Historial_Venta

### Atributos
- **ID**
- **Nombre_Comprador**
- **ID_Producto**
- **Fecha_Venta**
- **Cantidad**
- **Precio**

### Operaciones
- `Agregar Venta (ID_Producto, Cantidad, Validar Stock) -> Bool`  
- `Listar Ventas () -> Lista<Historial_Venta>`  
- `Filtrar Ventas (atributo, valor) -> Lista<Historial_Venta>`  

---

## 🚀 Posibles Mejoras Futuras
- Generar reportes de ventas (diarios, mensuales, anuales).  
- Integración con base de datos.  
- Interfaz gráfica o API REST.  
- Control de usuarios y roles (administrador, vendedor).  

