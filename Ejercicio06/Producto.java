
import java.util.Scanner;

public class Producto implements Funciones{
    private float precio;
    private String nombre;
    private int existentes;
    private String marca;
    private String serie;
    private Boolean portable;


    public Producto() {
    }



    public Producto(float precio, String nombre, int existentes, String marca, String serie,  Boolean portable) {
        this.precio = precio;
        this.nombre = nombre;
        this.existentes = existentes;
        this.marca = marca;
        this.serie = serie;
        this.portable = portable;
    }



    public float getPrecio() {
        return this.precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getExistentes() {
        return this.existentes;
    }

    public void setExistentes(int existentes) {
        this.existentes = existentes;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSerie() {
        return this.serie;
    }

    public void setSerie(String string) {
        this.serie = string;
    }


    public Boolean isPortable() {
        return this.portable;
    }

    public Boolean getPortable() {
        return this.portable;
    }

    public void setPortable(Boolean portable) {
        this.portable = portable;
    }


    @Override
    public String toString() {
        String cadena = "";
        cadena += getNombre()+","+getNombre() + "," +getMarca() + "," +getSerie();

    return cadena;
    }


    Scanner s = new Scanner(System.in);
    public String llamar(){
        int numero = 0;
        System.out.println("Ingresa tu número de telefono: ");
        numero = s.nextInt();
        return "Llamando...";
    }

    public String tomarFoto(){
        String Foto = "";
        System.out.println("Para tomar foto presiona cualquier letra o tecla: ");
        Foto = s.next();
        System.out.println("En 5...4...3...2...1 ");
        return "Click 📷";
    }

    public String navegar(){
        String buscar = "";
        System.out.println("¿Qué quieres buscar: ?");
        buscar = s.next();
        return "Abriendo Google Chrome...";
    }

    public String reproducirVideos(){
        String video = "";
        System.out.println("¿Qué video quieres buscar?");
        video = s.next();
        return "Reproduciendo 🎥";
    }

    public String jugar(){
        String juego = "";
        System.out.println("¿Qué juego quieres jugar?: ");
        juego = s.next();
        return "Jugando...UGH";
    }

    public boolean portable(){
        return true;
    }

    
}
