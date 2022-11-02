public class Tienda {
    String nombre;
    String pais;
    String ubicacion;


    public Tienda(String nombre, String pais, String ubicacion) {
        this.nombre = nombre;
        this.pais = pais;
        this.ubicacion = ubicacion;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getUbicacion() {
        return this.ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }


    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", pais='" + getPais() + "'" +
            ", ubicacion='" + getUbicacion() + "'" +
            "}";
    }


    
}
