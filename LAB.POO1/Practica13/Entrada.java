//Elías Dávila Torres
//8/11/2019
//importes
import java.io.*;
import java.io.IOException;
public class Entrada {
  public static void main(String[] args) {
    String path = "./"+args[0];
    HerramientasArchivo hA = new HerramientasArchivo(path);
    File file = new File(path);
    if(file.isDirectory()) {
      System.out.println("Es directorio");
      System.out.println(file.list());
    }
    if(!file.exists()){
      hA.crearArchivo();
    } else {
      System.out.println(file.canRead() ? "Se puede leer" : "No se puede leer");
      System.out.println(file.canWrite() ? "Se puede escribir" : "No se puede escribir");
      System.out.println("Tamaño" + " "+file.length());
      hA.crearArchivo();
      hA.escribirArchivo();
    }
  }
}
