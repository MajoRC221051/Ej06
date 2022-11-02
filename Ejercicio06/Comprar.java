import java.util.ArrayList;

public class Comprar {
    Cliente cliente;
    Tienda tienda;
    ArrayList<Producto> productos = new ArrayList<Producto>();
    float total;


    public Comprar(Cliente cliente, Tienda tienda, ArrayList<Producto> productos, float total) {
        this.cliente = cliente;
        this.tienda = tienda;
        this.productos = productos;
        this.total = total;
    }

    
}
