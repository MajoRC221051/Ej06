public class Cliente {
    String nombre;
    String nit;
    String dpi;
    Carrito_compras carrito;
    String contacto;


    public Cliente(String nombre, String nit, String dpi, Carrito_compras carrito, String contacto) {
        this.nombre = nombre;
        this.nit = nit;
        this.dpi = dpi;
        this.carrito = carrito;
        this.contacto = contacto;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return this.nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDpi() {
        return this.dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public Carrito_compras getCarrito() {
        return this.carrito;
    }

    public void setCarrito(Carrito_compras carrito) {
        this.carrito = carrito;
    }

    public String getContacto() {
        return this.contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }


    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", nit='" + getNit() + "'" +
            ", dpi='" + getDpi() + "'" +
            ", carrito='" + getCarrito() + "'" +
            ", contacto='" + getContacto() + "'" +
            "}";
    }

    
    
}
