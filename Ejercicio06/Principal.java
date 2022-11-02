import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){

        Cliente cliente = new Cliente(null, null, null, null, null);
        Carrito_compras carrito = new Carrito_compras(null, 0, null, 0);
        Tienda tienda = new Tienda(null, null, null);
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Producto> listarProductos = new ArrayList<Producto>();

            String nombrecliente, nitcliente, contactocliente, dpicliente;
            System.out.println("Por favor ingrese el nombre del cliente: ");
            nombrecliente = scanner.next();
            System.out.println("Por favor ingrese el contacto del cliente: ");
            contactocliente = scanner.next();
            System.out.println("Por favor ingrese su número de Nit: ");
            nitcliente = scanner.next();
            System.out.println("Por favor ingrese su número de DPI: ");
            dpicliente = scanner.next();
            cliente.setNombre(nombrecliente);
            cliente.setContacto(contactocliente);
            cliente.setNit(nitcliente);
            cliente.setDpi(dpicliente);


            String nombreTienda,ubicacionTienda,paisTienda;
            System.out.println("Por favor ingrese el nombre de la tienda: ");
            nombreTienda = scanner.next();
            System.out.println("Por favor ingrese la ubicacion de la tienda: ");
            ubicacionTienda = scanner.next();
            System.out.println("Por favor ingrese su número de País en el que se ubica la tienda: ");
            paisTienda = scanner.next();
            tienda.setNombre(nombreTienda);
            tienda.setPais(paisTienda);
            tienda.setUbicacion(ubicacionTienda);


            int opcion = 0;
            while(opcion !=3){
                System.out.println("Bienvenido a Electrónica Centroaméricana :)" );
                System.out.println("¿Qué deseas hacer el día de hoy?");
                System.out.println("1. Comprar artículos");
                System.out.println("2. Ver carrito de compras");
                System.out.println("3. Procesar compra");
                opcion = scanner.nextInt();
                if(opcion ==1){
                int seleccion = 0;
                Producto producto = new Producto(seleccion, nombreTienda, seleccion, ubicacionTienda, paisTienda, false);

                System.out.println("Por favor elija un producto:" );
                System.out.println("1. Smartphone---carácterísticas: Llamadas, fotografias, navegar, videos, portable");
                System.out.println("2. Telefono celular---carácterísticas: Llamadas, portable");
                System.out.println( "3. Telefono fijo---carácterísticas: Llamadas");
                System.out.println("4. Camara fotografica---carácterísticas:  fotografias, reproducir videos, portable");
                System.out.println("5. Computador desktop---carácterísticas: Navegar internet, reproducir videos, ejecutar videojuegos ");
                System.out.println("6. Laptop---carácterísticas: Navegar internet, ejecutar videojuegos, reproducir videos, portable");
                System.out.println("7. Smart Tv---carácterísticas: Navegar por internet, reproducir videos");
                System.out.println("8. Tablets---carácterísticas: Tomar fotografias, navegar internet,reproducir videos");
                System.out.println("9. Smart watch---carácterísticas: Tomar fotografias, hacer llamada, portable");

                seleccion = scanner.nextInt();
                if(seleccion == 1){

                    producto.setNombre("Smartphone");
                    producto.setMarca("Samsung");
                    producto.setPortable(true);
                    producto.setExistentes(5);
                    producto.setSerie("Galaxy SNote 10");
                    producto.setPrecio(2000);
    

                    System.out.println("Funciones:");
                    System.out.println("¿Interesado en el producto?...Prueba sus funciones:)");
                    System.out.println(producto.llamar());
                    System.out.println(producto.tomarFoto());
                    System.out.println(producto.navegar());
                    System.out.println(producto.reproducirVideos());
                    System.out.print(producto.portable());

                    listarProductos.add(producto);
                    carrito.agregarProducto(producto);}

                else if(seleccion == 2){
                    producto.setNombre("Celular");
                    producto.setMarca("Huaweii");
                    producto.setPortable(true);
                    producto.setExistentes(10);
                    producto.setSerie("Mate P50");
                    producto.setPrecio(2500);

                    System.out.println("Funciones:");
                    System.out.println("¿Interesado en el producto?...Prueba sus funciones:)");
                    System.out.println(producto.llamar());
                    System.out.println(producto.portable());
                    listarProductos.add(producto);
                    carrito.agregarProducto(producto);           
                }
                else if(seleccion == 3){
                    producto.setNombre("Telefono Fijo");
                    producto.setMarca("Panasonic");
                    producto.setPortable(false);
                    producto.setExistentes(20);
                    producto.setSerie("Dect");
                    producto.setPrecio(450);

                    System.out.println("Funciones:");
                    System.out.println("¿Interesado en el producto?...Prueba sus funciones:)");
                    System.out.println(producto.llamar());
                    listarProductos.add(producto);
                    carrito.agregarProducto(producto);   }
                else if(seleccion == 4){
                    producto.setNombre("Cámara Fotográfica");
                    producto.setMarca("Cannon");
                    producto.setPortable(true);
                    producto.setExistentes(30);
                    producto.setSerie("EOS Rebel T7 ");
                    producto.setPrecio(1500);

                    System.out.println("Funciones:");
                    System.out.println("¿Interesado en el producto?...Prueba sus funciones:)");
                    System.out.println(producto.tomarFoto());
                    System.out.println(producto.reproducirVideos());
                    System.out.println(producto.portable());
                    listarProductos.add(producto);
                    carrito.agregarProducto(producto);
                
                }

                else if(seleccion == 5){
                    producto.setNombre("Computadora Desktop personal");
                    producto.setMarca("HP");
                    producto.setPortable(false);
                    producto.setExistentes(12);
                    producto.setSerie("Elite Tower 600 G9 ");
                    producto.setPrecio(4000);
                    

                    System.out.println("Funciones:");
                    System.out.println("¿Interesado en el producto?...Prueba sus funciones:)");
                    System.out.println(producto.navegar());
                    System.out.println(producto.reproducirVideos());
                    System.out.println(producto.jugar());
                    System.out.print(producto.portable());

                    listarProductos.add(producto);
                    carrito.agregarProducto(producto);
                }
                else if(seleccion == 6){
                    producto.setNombre("Laptop personal");
                    producto.setMarca("Dell");
                    producto.setPortable(true);
                    producto.setExistentes(22);
                    producto.setSerie("Celeron ");
                    producto.setPrecio(6500);

                    System.out.println("Funciones:");
                    System.out.println("¿Interesado en el producto?...Prueba sus funciones:)");
                    System.out.println(producto.navegar());
                    System.out.println(producto.reproducirVideos());
                    System.out.println(producto.jugar());
                    System.out.print(producto.portable());

                    listarProductos.add(producto);
                    carrito.agregarProducto(producto);}

                else if (seleccion == 7){
                    producto.setNombre("Smart Tv");
                    producto.setMarca("LG");
                    producto.setPortable(false);
                    producto.setExistentes(25);
                    producto.setSerie("WebOs 3 ");
                    producto.setPrecio(9000);
   
                    System.out.println("Funciones:");
                    System.out.println("¿Interesado en el producto?...Prueba sus funciones:)");
                    System.out.println(producto.navegar());
                    System.out.println(producto.jugar());
   
                    listarProductos.add(producto);
                    carrito.agregarProducto(producto);}

                if(seleccion == 8){
                        producto.setNombre("Tablet");
                        producto.setMarca("Apple");
                        producto.setPortable(true);
                        producto.setExistentes(33);
                        producto.setSerie("iPad Pro 11  ");
                    producto.setPrecio(8000);
            
                        System.out.println("Funciones:");
                        System.out.println("¿Interesado en el producto?...Prueba sus funciones:)");
                        System.out.println(producto.navegar());
                        System.out.println(producto.reproducirVideos());
                        System.out.println(producto.tomarFoto());
                        System.out.print(producto.portable());
            
                        listarProductos.add(producto);
                        carrito.agregarProducto(producto);}

                    if(seleccion == 9){
                            producto.setNombre("Smart Watch");
                            producto.setMarca("Xiaomi");
                            producto.setPortable(true);
                            producto.setExistentes(38);
                            producto.setSerie("S1 Active ");
                    producto.setPrecio(1200);
                
                            System.out.println("Funciones:");
                            System.out.println("¿Interesado en el producto?...Prueba sus funciones:)");
                            System.out.println(producto.llamar());
                            System.out.println(producto.tomarFoto());
                            System.out.print(producto.portable());
                
                            listarProductos.add(producto);
                            carrito.agregarProducto(producto);}
            }

            else if(opcion == 2){
                carrito.setProductos(listarProductos);
                if(listarProductos.size()==00){
            System.out.println("Carrito Empty :(");
                }
            else{
                System.out.println("Carrito: ");
            carrito.listarCarrito_compras();
            }



            }

            else if(opcion ==3){
                if(listarProductos.size() == 0){
                System.out.println("Gracias por visitar nuestra tienda... Carrito vacío, no realizaste ninguna compra :(");
                }
                else{
                    carrito.setProductos(listarProductos);
                    System.out.println("-------------------FACTURA--------------------");
                    System.out.println("__________________________________________________");

                    System.out.println("-----#Información Cliente-----");
                    System.out.println(cliente.toString());

                    System.out.println("----#Resumen de compra---");
                    carrito.listarCarrito_compras();
                    Info personas = new Info("Registro de compras", "nombre, marca, serie, precio, cliente");
                    String linea="";
                    linea+=cliente.getNombre()+",";
                    linea+=cliente.getNit()+",";
                    linea+=cliente.getContacto();
                    personas.escribirArchivo(linea);
                    Info comprar2 = new Info("Registro", "nombre, marca, precio, cliente, serie");
                    for(int i=0;i<listarProductos.size();i++){
                        comprar2.escribirArchivo(listarProductos.get(i).toString()+","+cliente.getNombre());
                    }
                    









                }

            }
   }
        }

}
    }
