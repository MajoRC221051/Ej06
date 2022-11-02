import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Info {
    private File info;

    public Info (String nombre, String linea){
        info = new File(nombre);
        try {
            info.createNewFile();
            escribirArchivo(linea);
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }


    void escribirArchivo(String linea) {
        try {
            FileWriter escribir = new FileWriter(info);
            escribir.write(linea);
            escribir.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }


    public ArrayList <String> leerArchivo(){
        Scanner miInfo;
        ArrayList <String> lineas = new ArrayList <String>();
        try {
            miInfo = new Scanner(info);
            while (miInfo.hasNextLine());
            lineas.add(miInfo.nextLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();

            // TODO: handle exception
        } 

        return lineas;
    }

    public String leerArchivoString(){
        String text = "";
        try {
            try(Scanner miInfo = new Scanner(info)){
            while (miInfo.hasNextLine()){
                text = text +miInfo.nextLine() +"\n";
            }
        }
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return text;
    }

    public void eliminarArchivo(){
        info.delete();
    }





    
}
