import java.util.ArrayList;
import java.util.Collections;

public class Carrito_compras {
    String Cliente;
    int disponibilidad;
    ArrayList <Producto> productos = new ArrayList<Producto>();
    float total;


    public Carrito_compras(String Cliente, int disponibilidad, ArrayList<Producto> productos, float total) {
        this.Cliente = Cliente;
        this.disponibilidad = disponibilidad;
        this.productos = productos;
        this.total = total;
    }

    public void agregarProducto(Producto producto){
        total+= producto.getPrecio();

    }

    public void listarCarrito_compras(){
        for(int i=0;i<productos.size();i++){
            System.out.println("****"+productos.get(i).getNombre());
        }

        System.out.println("Su total es:"+total);

    }


    public String getCliente() {
        return this.Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public int getDisponibilidad() {
        return this.disponibilidad;
    }

    public void setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public ArrayList<Producto> getProductos() {
        return this.productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public float getTotal() {
        return this.total;
    }

    public void setTotal(float total) {
        this.total = total;
    }


    @Override
    public String toString() {
        return "{" +
            " Cliente='" + getCliente() + "'" +
            ", disponibilidad='" + getDisponibilidad() + "'" +
            ", productos='" + getProductos() + "'" +
            ", total='" + getTotal() + "'" +
            "}";
    }

    
}
